<?php
    session_start();
    $validate = $_POST['validate'];
    if(empty($validate)|| empty($_SESSION['ludou_lcr_secretword'])|| (trim(strtolower($validate)) != $_SESSION['ludou_lcr_secretword'])){
        echo "验证码不正确";
        exit;
    }else{
        echo "验证码正确";
    }
?>