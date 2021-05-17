package main

import "fmt"

func test() {
	//使用defer和recover通过匿名函数抛出异常，让后面代码继续执行
	//写法1
	defer func() {
		err := recover()
		if err != nil {
			fmt.Println("err=", err)
		}
	}()
	//写法2
	//defer func() {
	//	if err := recover(); err != nil {
	//		fmt.Println("err=", err)
	//	}
	//}()
	a := 30
	b := 0
	res := a / b
	fmt.Println(res)
}
func main() {
	test()
	fmt.Println("success")
}
