package main

import (
	"fmt"
	"golangStudy/go_function/demo2/lib"
)

//init函数，完成一些初始化的工作
func init() {
	fmt.Println("main init")
}
func main() {
	fmt.Println("main----age=", lib.Age)
	fmt.Println("main----name=", lib.Name)
}
