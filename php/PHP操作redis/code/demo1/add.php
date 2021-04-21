<?php
/**
 * Created by PhpStorm.
 * User: mixmedia
 * Date: 16-6-28
 * Time: 下午4:15
 */
require_once('./../redis.php');
$username = $_POST['username'];
$password = $_POST['password'];
$age = $_POST['age'];
$uid = $redis->incr('user_id');
$redis->hMset('user.'.$uid,array('uid'=>$uid,'username'=>$username,'password'=>$password,'age'=>$age));

//加入队列uid
$redis->rPush('uid',$uid);

header("location:list.php");

