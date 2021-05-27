package main

import "fmt"

type A struct {
	Num int
}
type B struct {
	Num int
}


type Student struct {
	Name string
}
//结构体进行type重新定义
type Stu Student

func main() {
	var a A
	var b B
	a = A(b)//强转的前提是保证两个结构体
	fmt.Println(a)
	fmt.Println(b)
}
