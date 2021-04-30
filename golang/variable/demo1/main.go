package main

import "fmt"

//声明全局变量
var test1 = 100
var test2 = 100
var (
	test3 = 300
	test4 = 400
)

func main() {
	//指定变量类型，声明后不赋值，使用默认值
	var i int
	fmt.Println("i=", i)

	//根据值自行判断变量类型(类型推导)
	var num = 10.0
	fmt.Println("num=", num)

	//省略var，:=赋值，左侧变量不应该是已经声明过的
	name := "test"
	fmt.Println("name=", name)

	//支持一次性声明多个变量
	var n1, n2, n3 int
	fmt.Println("n2=", n1)
	fmt.Println("n2=", n2)
	fmt.Println("n3=", n3)
	a, b := "test", 10
	fmt.Println("a=", a)
	fmt.Println("b=", b)

	var n4, myname, n5 = 10, "test", 10
	fmt.Println("n4=", n4, "name=", myname, "n5=", n5)
	fmt.Println("n4=", n4, "name=", myname, "n5=", n5)
	fmt.Println("test1=", test1, "test2=", test2, "test3=", test3, "test4=", test4)

}
