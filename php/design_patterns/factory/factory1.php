<?php
/**
 * Created by PhpStorm.
 * User: Administrator
 * Date: 2019/3/6
 * Time: 20:51
 */
//共同接口
interface  Db{
    function conn();
}

//服务端开发（不知道会被谁调用）
class  DbMysql implements  Db{
    public function  conn(){
        echo  'conn mysql';
    }
}
class  DbsQllit  implements  Db{
    public function  conn(){
        echo  'conn lllite';
    }
}
//客户端调用看不到DbMysql，DbsQllite的内部细节，只知道上两个类实现了db接口
$db = new  DbMysql();
$db->conn();


