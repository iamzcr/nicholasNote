<?php
/**
 * redis操作类
 */
class RedisMysql{
    public
        $host,
        $port,
        $redis;
    public function __construct($host,$port) {
        $this->host = $host;
        $this->port = $port;
        $this->redis = new Redis();
        $this->redis->connect($this->host,$this->port);

    }
    public function set_key($key,$time,$value) {
        try{
            $this->redis->setex( $key, $time, $value );
        }catch( Exception $e ){
            echo $e->getMessage();
        }
    }
    function get_key($key){
        try{
            return  $this->redis->get( $key);
        }catch( Exception $e ){
            echo $e->getMessage();
        }
    }

    function del_key( $key ){
        try{
            $this->redis->del( $key);
        }catch( Exception $e ){
            echo $e->getMessage();
        }
    }

}
?>