<?php
/**
 * Created by PhpStorm.
 * User: mixmedia
 * Date: 16-6-28
 * Time: 下午4:24
 */
require_once('./../redis.php');
//记录数
$count = $redis->lSize('uid');
echo $count;
//页总数
$page_size= 3;
//当期页
$page_num = (!empty($_GET['page']))?$_GET['page']:1;
//页总数
$page_count = ceil($count/$page_size);

for($i = 1;$i<=($redis->get('user_id'));$i++){
    $data[] = $redis->hGetAll('user.'.$i);
}
$data = array_filter($data);//过滤空值
?>
<table border="1">
    <tr>
        <th>uid</th>
        <th>username</th>
        <th>age</th>
        <th>操作</th>
    </tr>
    <?php foreach($data as $k=>$v){?>
    <tr>
        <td><?= $v['uid']?></td>
        <td><?= $v['username']?></td>
        <td><?= $v['age']?></td>
        <td><a href="<?php echo "del.php?uid=".$v['uid'];?>">删除</a ><a href="<?php echo "edit.php?uid=".$v['uid'];?>">编辑</a></td>
    </tr>
    <?php }?>
</table>