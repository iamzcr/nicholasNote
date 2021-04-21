<?php

    class Database{
        static  private  $_instance;
        static  private $conn;
        private  $_dbconfig = array(
            'host'=>'127.0.0.1',
            'user'=>'root',
            'password'=>'',
            'dbname'=>'api',
        );
        private   function  __construct(){
        }
        public static   function  getInstance(){
            if(empty(self::$_instance)){
                self::$_instance = new self();
            }
            return self::$_instance;
        }
        public function  connect(){
            if(!isset(self::$conn)){
                self::$conn = mysql_connect($this->_dbconfig['host'],$this->_dbconfig['user'].$this->_dbconfig['password']);
                if(!self::$conn){
                    die('mysql connect error'.mysql_error());
                }
                mysql_select_db($this->_dbconfig['dbname'],self::$conn);
                mysql_query("set names UTF8",self::$conn);
            }
            return self::$conn;
        }


        /* Functions for converting sql result  object to array goes below  */

        function convert_to_array( $result ){
            $resultArray = array();

            for( $count=0; $row = $result->fetch_assoc(); $count++ ) {
                $resultArray[$count] = $row;
            }

            return $resultArray;
        }

    }
?>