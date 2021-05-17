package main

import "fmt"

func sum(a, b int) int {
	//当执行到defer时候，暂时不执行，将defer后面的语句放到独立的栈中
	//当函数执行完毕之后，再从栈中，按照先进后出的方式出栈，执行
	defer fmt.Println("a=", a)
	defer fmt.Println("b=", b)
	a++
	b++
	res := a + b
	fmt.Println("sum=", res)
	return res
}
func main() {
	res := sum(1, 2)
	fmt.Println("main=", res)
}
