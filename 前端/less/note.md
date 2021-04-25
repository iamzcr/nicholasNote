less文件编译成css文件

命令行
lessc xxx.less xxx.css

ide自动编译
webstorm配置自动编译less
安装less：npm install less -g
查看是否安装成功，lessc -version
查看less.cmd位置
where less
C:\Users\Administrator.USER-20170119VH\AppData\Roaming\npm\lessc.cmd
配置webstorm
file->settings->file Watchers,点击+找到less文件选项点击添加
配置下面几个参数
prograns：lessc命令路径（C:\Users\Administrator.USER-20170119VH\AppData\Roaming\npm\lessc.cmd）
Arguments：要编译的less文件路径($FileParentDir(less)$\less\$FileName$)
Output paths to refresh：编译后输出的css文件的路径($FileParentDir(less)$\css\$FileNameWithoutExtension$.css)

less变量
@font16:16px;
body{
  font-size:@font16;
}

less嵌套
.header{
    width:200px;
    height:200px;
    background-color:green;
    a{
        color:red
    }
}
如果有伪类、交集选择器，、伪元素选择器，我们内层选择器的前面要加&
.header{
    width:200px;
    height:200px;
    background-color:green;
    a{
        color:red
        &:hover{
        color:blue
        }
    }
}

less运算
两个数参与运算，只有一个单位，结果就以这个单位为准
两个数参与运算，都有单位，结果就以第一个为准
@border:2px * 5;
.test{
  width:200px - 50;
  height:200px * 2;
  font-size:(200 / 2rem);
  border: @border solid deeppink;
}
