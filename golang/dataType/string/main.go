package main

import "fmt"

func main() {
	var test string
	fmt.Println(test)

	var a string = "hello world"
	fmt.Printf("a=%v\n", a)
	fmt.Println(a)
	//反引号
	var b string = `hello world fmt.Println(a)\n`
	fmt.Println(b)
	//拼接
	var c string = "1111"
	c += "22222"
	fmt.Println(c)
}
