package main

import "fmt"

func main() {
	var n = 1
	var m = 12
	fmt.Println(n == m)
	fmt.Println(n > m)
	fmt.Println(n != m)
	flag := n > m
	fmt.Println(flag)

	age := 40
	if age > 10 && age < 40 {
		fmt.Println("success")
	} else {
		fmt.Println("fail")
	}

	var i int
	i = 10 //基本赋值
	a := 9
	b := 2
	a, b = b, a
	fmt.Println(a)
	fmt.Println(b)
	fmt.Println(i)
	//复合赋值
	b += 2
	fmt.Println(b)
}
