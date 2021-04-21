mysql常用函数
链接字符串
select concat('hello','world') as myname;
转换小写
select lcase('erer')
转换大写
select ucase('ucase')
长度
select length('123456')
去除前端空格
select ltrim('   123456')
去除后端空格
select rtrim('123456    ')
重复count次
select repeat('123',3)
替换
select replace('dadsa',"da",'jj');
截取
select substring('dadsa',1,2);
生成空格
select space(5);

select concat(space(20),'linux')

数学函数
十进制转二进制
select bin (20);
向下取整
select floor(56.2)
向上取整
select ceiling(56.6)
取最大(聚合的时候使用)
select max(566,55)
去最小(聚合的时候使用)
select min(566,77)
例如
CREATE TABLE `student` (
  `id` int(11) NOT NULL,
  `name` varchar(64) CHARACTER SET utf8 NOT NULL,
  `score` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

INSERT INTO `student` (`id`, `name`, `score`) VALUES
(1, '小猪', 20),
(2, '小猪', 53),
(3, '小猪', 66);
select name, min(score),max(score) from student group by name;

开平方
select sqrt(566)
返回0-1随机值
select rand();

select * from t1 order by rand()

日期函数
返回当前日期
select curdate() 
返回当前时间
select curtime() 
返回当前日期时间
select now() 
返回当前日期时间

select unix_timestamp('2012-10-10') 
返回当前date的unix时间戳
select from_unixtime() 
返回日期date为一年中的第几周
select week('2012-10-10') 
返回日期date年份
select year('2012-10-10') 
返回起始时间和结束时间间隔天数
select datediff('2012-10-10','2012-10-15');