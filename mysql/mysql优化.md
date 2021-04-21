mysql优化
慢查询：
超过指定时间内的查询的查询语句
优化一般步骤
1，通过慢查询日志看看那条sql语句查询慢
2，通过解析这条查询语句的查看影响行数
3，是否需要加索引

通过show status命令了解各种sql语句的执行效率
show session status
show global status
session(默认)表示本次登录至今增删查改多少次
global表示自数据库启动至今增删查改多少次

查找 插入数据情况
show status like "com_insert%"
查找 插入查询情况
show status like "com_select%"
查找 插入更新情况
show status like "com_update%"
查找 插入删除情况
show status like "com_delete%"
show global status like "com_delete%";
通过上面的查询，可以判断出你的操作是以上面为主，从而选择数据库引擎
查询较多的，选用myisam引擎，插入修改较多的，选用innodb引擎

只针对innodb,查找增删查改次数
show status like "innodb_rows%";
show global status like "innodb_rows%";

链接mysql的数量
show status like "connections"
服务器已经工作的秒数
show status like "Uptime"
慢查询的次数
show status like "Slow_queries"

查看慢查询日志是否开启
show variables like "%slow%"
查看慢查询设置的时间
show variables like "%long%";

explain和desc解析语句
\G表示格式化查询出来的结果，方便分析
explain select * from t1 where id = 2\G
desc select * from t1 where name  = "user1"\G



