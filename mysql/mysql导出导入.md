创建一个实验表
create table t2(
id int unsigned not null auto_increment primary key,
name varchar(30)
);

insert into t2(name) values('user3');
insert into t2(name) values('user4');
insert into t2(name) values('user5');

mysql表优化
定期分析表
analyze table t2;
检查表
check table t2
优化表
optimize table t2
如果已经删除了表的一大部分，或者如果已经对含有
可变长度行的表进行了很多的改动，则需要做定期优化。
这个命令可以将表中的空间碎片进行合并，但是此命令只对
myisam，bdb和innodb表起作用


mysql导入：
mysql -uroot -p000000 quick </remark/sql/quick.sql

其中000000是mysql的用户root的密码，/remark/sql/quick.sql是导入的sql文件的路径，<符号表示导入，quick表示要导入的数据库

mysql导出：
mysqldump -uroot -p000000 quick>/tmp/quick.sql

其中000000是mysql的用户root的密码，/tmp/quick.sql是导出的sql文件的路径，<符号表示导出，quick表示要导出的数据库

mysql，mysqldump 可以写mysql的全路径执行 例如：

/usr/bin/mysqldump -uroot -p000000 quick >/tmp/quick.sql
/usr/bin/mysql -uroot -p000000 quick </remark/sql/quick.sql

当用load命令导入数据的时候，适当设置可以提高导入速度
防止导出大量的多余语句：
select name from t2 into  outfile  "/tmp/t2.txt"
导入数据
load data infile  "/tmp/t2.txt" into table t2(name);

如果存在索引的字段，导入的时候，每导入一条数据，就添加一个索引，这是不科学的
对于myisam引擎的表，可以通过以下方式快速导入大量的数据，先关闭普通索引，唯一索引关掉要注意，如果有相同的记录导入的时候
如果导入的时候关掉了唯一索引，那么当导入完成，重新添加唯一索引的时候就会报错
关闭普通索引
alter table t2 disbale keys
开启普通索引
alter table t2 enable keys

关闭唯一性校验（唯一索引）可以提高导入效率
在导入数据前，先执行set unique_checks = 0，关闭唯一性校验
在导入结束后执行set unique_checks = 1,恢复唯一性校验

针对innodb类型的表数据导入的优化
1、因为innodb表示按照主键顺序保存的，所以将导入的数据的主键的顺序排列，
可以有效提高导入数据的效率
2、关闭自动提交可以提高导入效率
针对于innodb，在导入数据之前先执行set autocommit = 0；关闭自动提交事务
在导入结束后执行set autocommit=1，恢复自动提交，可以提高导入效率

把所有的表解锁
unlock tables

执行insert的时候：使用多个值一起插入，这样可以缩短客户与数据库的链接，关闭等损耗
insert into t2(name) values('user4'),('user5'),('user6')