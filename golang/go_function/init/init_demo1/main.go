package main

import "fmt"

var age = test()

func test() int {
	fmt.Println("test")
	return 90
}

//init函数，完成一些初始化的工作
func init() {
	fmt.Println("main init")
}
func main() {
	fmt.Println("main----age=", age)
}
