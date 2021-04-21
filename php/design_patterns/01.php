<?php
/**
 * Created by PhpStorm.
 * User: Administrator
 * Date: 2019/3/6
 * Time: 18:33
 * 多态
 */
abstract  class Tiger{
    public abstract function  climb();
}
class  XTiger extends  Tiger{
    public function climb()
    {
        echo 123;
    }
}

class  MTiger extends  Tiger{
    public function climb()
    {
        echo 456;
    }
}

class  Cat{
    public function climb()
    {
        echo 789;
    }
}

class  Client{
    //不指定类型
    public static function call($animal){
        $animal->climb();
    }
    //指定类型
    public static function to_call(XTiger $animal){
        $animal->climb();
    }

    //指定父类
    public static function to_all_call(Tiger $animal){
        $animal->climb();
    }
}

Client::call(new  XTiger());
Client::call(new  MTiger());
Client::call(new  Cat());
echo "\n";
Client::to_call(new  XTiger());
Client::to_call(new  MTiger()); //只能传入指定类型XTiger
Client::to_call(new  Cat());//只能传入指定类型XTiger
echo "\n";
Client::to_all_call(new  XTiger());
Client::to_all_call(new  MTiger());
Client::to_all_call(new  Cat());//只能传入指定类型Tiger的子类
echo "\n";