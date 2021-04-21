<?php
/**
 * Created by PhpStorm.
 * User: Administrator
 * Date: 2019/3/6
 * Time: 20:51
 * 只想知道一个类,简单工厂
 */
//共同接口
interface  Db
{
    function conn();
}

//服务端开发（不知道会被谁调用）
class  DbMysql implements Db
{
    public function conn()
    {
        echo 'conn mysql';
    }
}

class  DbsQlit implements Db
{
    public function conn()
    {
        echo 'conn lllite';
    }
}

class  Factory
{
    public static function createDB($type)
    {
        if ($type == 'mysql') {
            return new  DbMysql();
        } elseif ($type == 'DbsQlit') {
            return new  DbMysql();
        } else {
            throw new  Exception('error', 1);
        }
    }
}

//只知道客户端，现在不知道服务端有哪些类名，知道对方开放了一个Factory::createDB方法，方法允许传递数据库名称
$mysql = Factory::createDB('mysql');
$mysql->conn();

//如果要新增oracle类，上面就要多加一个elseif，显然不科学的，在面向对象设计法则中，重要的开闭原则:对于修改是封闭的，对于扩展是开发的

