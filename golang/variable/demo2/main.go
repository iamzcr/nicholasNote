package main

import "fmt"

func main() {
	var i int = 10
	i = 30
	fmt.Println("i=", i)
	//i = 1.2不能改变原来的类型
	//var i int = 60 变量在同一个作用域里面不能重名
}
