package main

import "fmt"

type myFuncType func(int, int) int //自定义数据类型
type myInt int                     //自定义数据类型,虽然都是int类型，go实际上认为这不是同一个类型，所以如果有一个类型为int的，一个是myInt的，实际上他们是不能相互赋值的

func main() {
	var num myInt = 666
	fmt.Printf("res=%v\n", num)
	res := myFun(getSum, 100, 120)
	fmt.Printf("res=%v\n", res)
}
func getSum(num1 int, num2 int) int {
	return num1 + num2
}
func myFun(function myFuncType, num1 int, num2 int) int {
	return function(num1, num2)
}
