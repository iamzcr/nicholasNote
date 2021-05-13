package main

import "fmt"

func main() {
	a := sum //把一个函数赋给a变量
	fmt.Printf("a的类型%T，sum的类型%T\n", a, sum)
	res := a(10, 40) //用a变量调用函数
	fmt.Printf("res=%v", res)
	myFun(a, 50, 60) //把一个函数当成参数传递
}

func sum(num1 int, num2 int) int {
	return num1 + num2
}
func myFun(function func(int, int) int, num1 int, num2 int) int {
	return function(num1, num2)
}
