package main

import "fmt"

type A struct {
	Name string
	age  int
}

type B struct {
	A   //组合结构体
	int //结构体是嵌入的时候是基本数据类型
	n int //结构体是嵌入的时候是基本数据类型
}

func main() {
	b := B{}
	b.Name = "ZCR"
	b.age = 10
	b.int = 10
	b.n = 20
	fmt.Println(b)
}
