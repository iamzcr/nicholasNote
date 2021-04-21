<?php
/**
 * Created by PhpStorm.
 * User: Administrator
 * Date: 2020/5/12
 * Time: 17:42
 */
require_once "lib/redis/RedisModel.php";
$redis = RedisModel::redisConnect();
$arr = ['h', 'e', 'l', 'l', 'o', 'w', 'o', 'r', 'l', 'd'];
foreach ($arr as $k => $v) {
    $redis->rpush("mylist", $v);
}
$value = $redis->ttl('mylist');
var_dump($value);exit;
$value = $redis->lpop('mylist');
var_dump($value);exit;
if($value){
    echo "出队的值".$value;
}else{
    echo "出队完成";
}