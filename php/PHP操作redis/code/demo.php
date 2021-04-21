<?php 
	$redis = new Redis();  
	$redis->connect("127.0.0.1","6379"); 
	// $redis->auth('123456') 如果有需要就配置认证密码
	$redis->set("say","Hello World");  
	echo $redis->get("say");    
	  
	$array = array(
					'key1'=>'first_val',  
		          	'key2'=>'second_val',  
		          	'key3'=>'third_val'
		          );  
	$array_get = array('key1','key2','key3');  
	$redis->mset($array);  

	var_dump($redis->mget($array_get)); 
?>