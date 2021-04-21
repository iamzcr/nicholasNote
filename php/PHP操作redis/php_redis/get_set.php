<?php
/**
 * Created by PhpStorm.
 * User: Administrator
 * Date: 2020/5/12
 * Time: 17:42
 */
require_once "lib/redis/RedisModel.php";
$redis = RedisModel::redisConnect();
$redis->set("tutorial-name", "Redis tutorial");
echo $redis->get("tutorial-name") . "\n";

$redis->setBit("2020-05-12", 100000000, 1);
echo $redis->getBit("2020-05-12", 100000000) . "\n";
$redis->setBit("2020-05-12", 99999, 1);
echo $redis->getBit("2020-05-12", 99999) . "\n";
$arr = array('h','e','l','l','o','w','o','r','l','d');

foreach($arr as $k=>$v){

    $redis->rpush("mylist",$v);

}