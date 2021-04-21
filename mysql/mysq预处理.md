mysql 预处理
设置stmt1预处理，传递一个数据作为一个where判断条件
prepare stmt1 from 'select * from t1 where id>?'
设置变量
set @i = 1;
select @i;
执行stmt1预处理
execute stmt1 using @i
设置变量
set @i = 5;
执行stmt1预处理
execute stmt1 using @i
删除预处理
drop prepare stmt1

mysql的事务处理（innodb才有，myisam没有）
关闭自动提交
set autocommit = 0;
删除一个记录
delete from t1 where id = 2;
此时做一个p1还原点
savepoint p1
再次删除一条记录
delete from t1 where id = 3;
再次做一个p2还原点
savepoint p2
此时恢复到p1还原点，当然后面的p2这些还原点自动失效
rollback to p1
退回到最原始的还原点
rollback

如果rollback不起作用，则查看表数据结构，是什么引擎
show create table t1;
改变表引擎
alter table t1 engine = innodb

如果想要真正执行上面的删除操作。因为上面已经设置了关闭自动提交，
所以这里需要commit一下，才能真正删除
commit

mysql 的存储
mysql的存储可以看做一个函数，写好要处理的sql语句，然后调用这个存储
修改语句定界符，因为存储里面有很多语句都是以分号结尾，所以要修改mysql的语句定界符
\d //
select * from t1 //
创建一个存储s1
create procedure s1()
begin
set @i = 11;
while @i <= 100 do
insert into t1(name) value(concat('user',@i));
set @i = @i+1;
end while;
end//
查看存储
show procedure status
查看单个存储
show create procedure s1
后面加\G表示格式化查看，方便查看
show create procedure s1\G
执行存储
call s1;

mysql触发器
触发器表示，当我要删除某个表的同时，触发一并删除某个表的数据
创建一个tg1的触发器，当向t1表插入数据name的时候 就向t2表插入一条name记录
create trigger tg1 before insert on t1 for each row
begin
insert into t2(name) values(new.name);
end//

删除表数据的时候，尽量使用truncate，因为执行较快
delete from t2
truncate t2


查看触发器
show triggers

如何制作删除表t1后t2表中的记录也跟着删除呢？
根据id删除
create trigger tg3 before delete on t1 for each row
begin
delete from t2 where id=old.id;
end//
根据名字删除
create trigger tg4 before delete on t1 for each row
begin
delete from t2 where name=old.name;
end//

如何制作修改表t1后t2表中的记录也跟着修改呢？
根据id修改
create trigger tg5 before update on t1 for each row
begin
update t2 set name = new.name where id=old.id;
end//
根据名字修改
create trigger tg6 before update on t1 for each row
begin
update t2 set name = new.name where name=old.name;
end//
上面的old.id表示因为原来已经有记录存在的，所以用old，如果新增的时候不存在，就用new
删除id等于1
delete from t1 where id = 1

select * from t1 union select * from t2;


mysql重排auto_increment值
使用truncate就能重排
delete from t2
truncate t2
或者下面设置也能重排
alter table t1 auto_increment = 1
