<?php
    require_once './RedisMysql.php';
    require_once './Database.php';

    $redis = new RedisMysql('127.0.0.1','6379');
    $redis->set_key('username',10,"zhuzhu");

    echo $redis->get_key('username');
?>