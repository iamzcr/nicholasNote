package main

import "fmt"

var (
	test = func(a, b int) int {
		return a * b
	}
)

func main() {
	res := func(a, b int) int {
		return a + b
	}(10, 20)
	fmt.Println(res)

	var function = func(a, b int) int {
		return a - b
	}
	res1 := function(20, 10)
	fmt.Println(res1)
	//全局匿名函数
	fmt.Println(test(2, 2))
}
