package main

import "fmt"

//小数类型的适用
func main() {
	var price float32 = 89.32
	fmt.Println("price = ", price)
	var a float32 = -123.000000001
	var b float64 = -123.000000001
	fmt.Println("a = ", a)
	fmt.Println("b = ", b)

	var c float64 = -12300000000.1
	fmt.Println("c = ", c)

	var d = 5.123e2
	var f = .123
	var e = 5.123E2
	var g = 5.123E-2
	fmt.Println("d = ", d)
	fmt.Println("f = ", f)
	fmt.Println("e = ", e)
	fmt.Println("g = ", g)
}
