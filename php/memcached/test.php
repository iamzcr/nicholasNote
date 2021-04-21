<?php

	ini_set("session.save_handler","memcache");
	ini_set("session.save_path","tcp://127.0.0.1:11211");
	//传统的代码
	session_start();
	$_SESSION['name']='i love php';
	$_SESSION['city']='yunfu';
	
	
	$mem=new Memcache;  
	$mem->connect("localhost",11211); 
	$str=$mem->get(session_id());
	$name = $_SESSION['name'];	
	echo $str;
	echo "<br/>";
	echo "<br/>";
	echo $name;
	echo "<br/>";
	echo "<br/>";
	echo session_id();

?>