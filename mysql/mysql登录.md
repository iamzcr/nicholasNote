登录mysql
mysql -uroot -p

mysql 查看命令帮助例如查看视图函数：

? view





查看单个视图 

数据库创建：
create database test;
查看数据库
show databases;
选择数据库
use test;

表的复制和创建
create table t1(
id int unsigned not null auto_increment primary key,
name varchar(30)
);
查看表
show tables
查看表结构
desc t1
explain t1
删除表
drop table t1
插入数据
insert into t1(name) value("user1");
查询
select * from t1;
复制表(表复制的时候，注意如果复制相同字段的表结构，select的时候可以直接带*号，如果不一样，就需要选择字段复制了)
create table t2 like t1
insert into t2 select * from t1

mysql索引（创建和删除索引有两个方法）
方法一（推荐，通用）
普通索引
alter table t1 add index index_name(name)
唯一索引（索引这一列不能有重复值，不然索引失效）
alter table t1 add unique un_name(name)
主键索引
alter table t1 add  primary key (name)

alter table t1 drop index index_name
alter table t1 drop primary key


方法二（此方法不能创建主键索引）
create index in_name on t1(name)
create unique index un_name on t1(name)
drop index in_name on t1

查看索引
show index from t1

删除主键索引的时候，不能直接删除，因为是自增的，先取消自增
alter table t1 modify id int unsigned not null
在删除
alter table t1 drop primary key

修改为自增
alter table t1 modify id int unsigned not null auto_increment;


创建视图（当删除t1表的某一条记录的时候，v_t1对应的那条记录也删除了，当t1表损坏了，再查询视图就报错了）
create view v_t1 as select * from t1 where id>1 and id<8;
select * from v_t1;
drop view v_t1;
视图的作用
当用户只需要查找某十条热门帖子的时候，可以创建一个视图去处理，这样就不需要每次都查整个表，提高效率