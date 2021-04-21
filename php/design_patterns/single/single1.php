<?php

/**
 * Created by PhpStorm.
 * User: Administrator
 * Date: 2019/3/6
 * Time: 21:27
 */
//1：普通的类
/*
class  Single
{

}

$s1 = new single();
$s2 = new single();
if ($s1 === $s2) {
    echo '同一个对象';
} else {
    echo "不是同一个对象";
}
*/
//2：普通的类
/*
class  Single
{
    protected function __construct()
    {
    }
}

//封锁了new操作，被保护了，报错
$s1 = new single();
*/

//3、留个接口new对象
/*
class  Single
{
    protected function __construct()
    {
    }

    public static function getIns()
    {
        return new  self();
    }
}

$s1 = Single::getIns();
$s2 = Single::getIns();
if ($s1 === $s2) {
    echo '同一个对象';
} else {
    echo "不是同一个对象";
}
*/
//4、getIns先判断实例
/*
class  Single
{
    protected static $ins = null;

    protected function __construct()
    {
    }

    public static function getIns()
    {
        if (self::$ins === null) {
            self::$ins = new self();
        }
        return self::$ins;
    }
}

$s1 = Single::getIns();
$s2 = Single::getIns();
if ($s1 === $s2) {
    echo '同一个对象';
} else {
    echo "不是同一个对象";
}

class Multi extends Single
{
    public function __construct()
    {
    }
}

$s1 = new Multi();
$s2 = new Multi();
if ($s1 === $s2) {
    echo '同一个对象';
} else {
    echo "不是同一个对象";
}
*/

//5、用final，防止继承时，被修改权限
/*
class  Single
{
    protected static $ins = null;

    //方法前加final，则方法不能被覆盖，类前加final，类不能被继承
    final protected function __construct()
    {
    }

    public static function getIns()
    {
        if (self::$ins === null) {
            self::$ins = new self();
        }
        return self::$ins;
    }
}

$s1 = Single::getIns();
$s2 = clone $s1;//被克隆，产生多个对象
if ($s1 === $s2) {
    echo '同一个对象';
} else {
    echo "不是同一个对象";
}
*/

//封锁克隆
/*
class  Single
{
    protected static $ins = null;

    //方法前加final，则方法不能被覆盖，类前加final，类不能被继承
    final protected function __construct()
    {
    }

    public static function getIns()
    {
        if (self::$ins === null) {
            self::$ins = new self();
        }
        return self::$ins;
    }

    //封锁克隆
    final protected function __clone()
    {

    }
}

$s1 = Single::getIns();
$s2 = clone $s1;//不能被克隆
*/
class  Single
{


    //方法前加final，则方法不能被覆盖，类前加final，类不能被继承
     protected function __construct()
    {
    }

    public static function getIns()
    {
        return new  self();

    }

}
echo "start m:".memory_get_usage()."</br>";
$s1 = Single::getIns();
$s2 = Single::getIns();
echo "run m:".memory_get_usage()."</br>";

class  SingleTest
{
    protected static $ins = null;

    protected function __construct()
    {
    }

    public static function getIns()
    {
        if (self::$ins === null) {
            self::$ins = new self();
        }
        return self::$ins;
    }
}


echo "start m:".memory_get_usage()."</br>";
$s3 = SingleTest::getIns();
$s4 = SingleTest::getIns();
echo "run m:".memory_get_usage()."</br>";
