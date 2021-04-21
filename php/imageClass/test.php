<?php
    require_once "Image.php";
    $img = new Image();
    $img->load('test.jpg');
    //裁剪
    $img->crop(100, 100);
    //文字水印
    $img->watermarktext('s-p','STZHONGS.TTF','rb','#000000','14');
    //重力旋转
    $orientation = $img->check_orientation('out1.jpg');
    $img->fix_rotate($orientation);
    $img->save('out1.jpg', IMAGETYPE_JPEG, 100);
?>