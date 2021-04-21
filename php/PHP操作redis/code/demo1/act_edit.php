<?php
/**
 * Created by PhpStorm.
 * User: mixmedia
 * Date: 16-6-28
 * Time: 下午4:55
 */
require_once('./../redis.php');
$uid = $_POST['uid'];
$username = $_POST['username'];
$password = $_POST['password'];
$age = $_POST['age'];
$redis->hMset('user.'.$uid,array('username'=>$username,'password'=>$password,'age'=>$age));
header("location:list.php");