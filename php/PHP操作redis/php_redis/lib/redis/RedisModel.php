<?php

/**
 * Created by PhpStorm.
 * User: Administrator
 * Date: 2020/5/12
 * Time: 17:36
 */
require_once "config/RedisConf.php";

class RedisModel
{
    public static $instance;

    public static function redisConnect()
    {
        try {
            $redis_config = RedisConfig::$config;
            if (!(self::$instance instanceof self)) {
                $redis_config = RedisConfig::$config;
                $redis = new Redis();
                $redis->connect($redis_config['host'], $redis_config['port']);
                self::$instance = $redis;
            }
            return self::$instance;
        } catch (\Exception $e) {
            return false;
        }
    }
}
