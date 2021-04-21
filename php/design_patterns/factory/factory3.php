<?php

/**
 * Created by PhpStorm.
 * User: Administrator
 * Date: 2019/3/6
 * Time: 20:51
 * 工厂方法
 */
interface  Db
{
    function conn();
}

interface Factory
{
    public function createDb();
}

class  DbMysql implements Db
{
    public function conn()
    {
        echo 'conn mysql';
    }
}

class  DbSQlite implements Db
{
    public function conn()
    {
        echo 'conn sqlite';
    }
}

class  mysqlFactory implements Factory
{
    public function createDb()
    {
        // TODO: Implement createDb() method.
        return new  DbMysql();
    }
}

class  sqliteFactory implements Factory
{
    public function createDb()
    {
        // TODO: Implement createDb() method.
        return new  DbSQlite();
    }
}


$fact = new mysqlFactory();
$db = $fact->createDb();
$db->conn();


$fact = new sqliteFactory();
$db = $fact->createDb();
$db->conn();