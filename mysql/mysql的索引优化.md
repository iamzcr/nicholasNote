mysql的索引优化

创建一个实验表
create table t1(
id int unsigned not null auto_increment primary key,
name varchar(30),
age int(11)
);

insert into t1(name,age) values('user3',23);
insert into t1(name,age) values('user4',24);
insert into t1(name,age) values('user5',25);
myisam存储引擎的表额数据和索引是自动分开存储的，各自是独一的一个文件
innodb存储引擎的表的数据和索引是存储在同一个表空间里面，但可以有多个文件组成
(不太明白)mysql不支持函数索引，但是能对列的前面某一部分进行索引，例如name字段，可以只取name的前4个字符进行索引，
这个特性可以大大缩小索引文件的大小，用户在设计表结构的时候也可以对文本列根据此特性进行灵活设计
create index in_name on t1(name(4));

如果像上面那样设置索引，当条件为2个字符的时候，索引起作用了
mysql> explain select * from t1 where name = "us"\G;
*************************** 1. row ***************************
           id: 1
  select_type: SIMPLE
        table: t1
         type: ref
possible_keys: in_name
          key: in_name
      key_len: 7
          ref: const
         rows: 1
        Extra: Using where

当条件为超过4个字符的时候，索引失效了了
mysql> explain select * from t1 where name = "user"\G;
*************************** 1. row ***************************
           id: 1
  select_type: SIMPLE
        table: t1
         type: ALL
possible_keys: in_name
          key: NULL
      key_len: NULL
          ref: NULL
         rows: 5
        Extra: Using where

1、对于创建多列索引，只要查询的条件中用到了最左边的列
索引一般就会被使用
创建一个复合索引
create index index_t1 on t1(name,age);
因为name是创建索引的时候在最左边，所以查询的时候，使用了索引
explain select * from t1 where name = "user3"\G;
因为age是创建索引的时候不在最左边，所以查询的时候，使用不了索引
explain select * from t1 where age = 23\G;

2、使用like的查询，后面如果是常量并且只有%号不在第一个字符，索引才有可能会被使用：
索引不被使用
explain select * from t1 where name like "%user"\G;
索引被使用
explain select * from t1 where name like "user%"\G;

如果对打的文本进行搜索，使用全文索引而不使用like"%...%"
如果列名是索引，使用name is null将使用索引
explain select * from t1 where name is null\G;

存在索引但不使用索引
1、如果mysql估计使用索引比全表扫描更慢，则不使用索引.
例如如果列key均匀分布在1到100之间，查询的时候使用索引就不是很好
explain select * from t1 where id>1 and id<6\G;
2、如果使用memory/heap表并且where条件中不使用“=”进行索引
列，那么不会用到索引。heap表只有在“=”的条件下会使用索引
3、用or分割开的条件，如果or前的条件中的列有索引，而后面的列中没
有索引，那么涉及的索引都不会被用到

age没有设置索引，id是主键索引，但是使用了or，所以索引不起作用了
explain select * from t1 where id <6 or age<33\G;
explain select * from t1 where id =5 or age=25\G;
name没有设置索引，id是主键索引，但是使用了and，所以索引不起作用了
explain select * from t1 where id =1 and name="user5"\G;

4、如果列类型是字符串，但是查询时吧一个数值型常量赋值给了一个字符型的列名name
，那么虽然在name列上有索引，但是也没有用到
插入一行那么字段为整数的数据
insert into t1(name,age) values(234,33);
给name添加索引
create index in_name on t1(name)
执行语句，这样是用不上索引的
explain select * from t1 where name = 234;

查看索引的使用情况
如果索引正在工作，Handler_read_key的值将很高，这个值
代表了一个行被索引值读的次数
Handler_read_rnd_next的值高则意味着查询运行低效，应该建立索引补救
show status like "Handler_read%"

