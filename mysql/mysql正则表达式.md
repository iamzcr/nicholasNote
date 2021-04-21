mysql正则表达式
以linux开头
select "linux is very good " regexp "^linux"
select "zhuchengru1314@163.com" regexp "@163[.,]com$"
select name,email from t where email regexp "@163[.,]com$"
select name,email from t where email like "%@163.com" or email like "%@163,com"

select * from t1 order by rand()
通过limit随机抽取3条数据样本
select * from t1 order by rand() limit 3;

使用group by的with rollup子句可以检索出更多的分组聚合信息
with rollup不可以和order by同时使用

create table demo(
	cname varchar(30),
	pname varchar(30)
);
insert into demo values('bj','hd');
insert into demo values('bj','hd');
insert into demo values('bj','xc');
insert into demo values('bj','xc');
insert into demo values('bj','hd');
insert into demo values('sh','hd');
insert into demo values('sh','rg');
insert into demo values('sh','hd');
insert into demo values('sh','hd');
select * from demo;
聚合
select * from demo group by cname;
select * from demo group by pname;
select * , count(pname) from  demo group by pname,cname;
select * , count(pname) from  demo group by pname,cname with rollup;

使用group by 语句时可以同时用使用bit_and、bit_or函数来
完成统计工作，这两个函数的作用主要是做数值之间的逻辑位运算

对order_rab表中的id分组是对kind做位与和或计算
select id bit_or(kind) from order_rab group by id;
select id bit_and(kind) from order_rab group by id;
实验
create table demo2(
	name varchar(30),
	score int(30)
);
insert into demo2 values('user1',10);
insert into demo2 values('user1',20);
insert into demo2 values('user1',30);
insert into demo2 values('user2',1);
insert into demo2 values('user2',2);
insert into demo2 values('user2',3);

对score进行与运算
select  bit_and(score) from demo2 group by name;

mysql的外键
不鼓励使用外键
innodb才支持外键，myisam不支持，虽然可以创建但是不起作用
创建外键
create table temp (id int,name char(20),foreign key(id) references outTable(id) on delete cascade on update cascade);

mysql问号的使用
? create
? drop
? contents