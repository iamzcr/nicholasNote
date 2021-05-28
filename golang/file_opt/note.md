###文件操作
######流：数据在数据源(文件)和程序(内存)之间经历的路径
######输入流：数据从数据源(文件)到程序(内存)的路径(读文件)
######输出流：数据从程序(内存)到数据源(文件)的路径(写文件)
####golang中文件操作库，os.File
######打开一个文件：func Open(name string) (file *File, err error)
######关闭文件：func (f *File) Close() error
案例存放在：file_opt/demo/main.go
######读取文件内容到内存并显示再终端(带缓存区方式)
案例存放在：file_opt/demo1/main.go
######一次性读取文件到内存，适用于文件不大
案例存放在：file_opt/demo2/main.go
######写文件操作
```
案例存放在：file_opt/demo3/main.go
案例存放在：file_opt/demo4/main.go
```
######从一个文件写到另外一个文件
案例存放在：file_opt/demo5/main.go
######拷贝一个文件到另外一个文件
案例存放在：file_opt/demo6/main.go
######统计一个字符
案例存放在：file_opt/demo7/main.go