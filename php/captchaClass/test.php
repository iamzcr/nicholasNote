<?php
//require_once "captcha.php";
?>
<html>
<head>
    <meta charset="utf-8">
    <title>test</title>
</head>
<body>

<form  method="post" action="post.php">
    <p>
    <p>
        <input class="ui-input input" type="text"name="validate">
    </p>
    <p>
        <a href="javascript:;" onclick="document.getElementById('captcha_img').src='captcha.php?'+Math.random(); return false;">
            <img id="captcha_img" src="captcha.php">
        </a>
    </p>
        <a href="javascript:void(0)" onclick="document.getElementById('captcha_img').src='captcha.php?'+Math.random();return false;">
            看不清，点击刷新
        </a>
    </p>
    <input type="submit" value="test"/>
</form>

</body>
</html>
