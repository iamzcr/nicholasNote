<?php
/**
 * Created by PhpStorm.
 * User: mixmedia
 * Date: 16-6-28
 * Time: 下午4:39
 */
require_once('./../redis.php');
$uid = $_GET['uid'];
$redis->del('user.'.$uid);
$redis->lRem('uid',$uid,1);
header("location:list.php");
