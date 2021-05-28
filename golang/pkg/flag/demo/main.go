package main

import (
	"flag"
	"fmt"
)

//生成main.exe 然后main.exe -u root -pwd 123123 h 192.168.18.48 p 11211进行测试
func main() {
	var user string
	var password string
	var host string
	var port int
	//&user表示接受用户命令行中输入的 -u 的后面参数的值
	//"u" 就是 -u 指定参数
	//"" 默认值
	//"用户名，默认为空" 说明
	flag.StringVar(&user, "u", "", "用户名，默认为空")
	flag.StringVar(&password, "pwd", "", "密码，默认为空")
	flag.StringVar(&host, "h", "127.0.0.1", "主机，默认为127.0.0.1")
	flag.IntVar(&port, "p", 3306, "端口，默认为3306")
	//必须要调用Parse才生效
	flag.Parse()

	fmt.Printf("user=%v;password=%v;host=%v,port=%v", user, password, host, port)
}
