<?php
require_once('./../redis.php');
$uid = $_GET['uid'];
$data = $redis->hGetAll('user.'.$uid);
?>
<form method="post" action="act_edit.php">
    <input type="hidden" value="<?= $data['uid']?>" name="uid">
    <input type="text" name="username" value="<?= $data['username']?>"></br>
    <input type="password" name="password"  value="<?= $data['password']?>"></br>
    <input type="text" name="age"  value="<?= $data['age']?>"></br>
    <input type="submit" name="submit" value="submit"></br>
</form>