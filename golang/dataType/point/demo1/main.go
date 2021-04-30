package main

import "fmt"

type test struct {
	Name int
}

func main() {
	var num int = 10
	//取出变量num的在内存中所在的地址
	fmt.Println(&num)
	//var ptr *int = &num,ptr是一个指针变量，类型是*int，表示指向一个int类型的指针，ptr本身的值是&num
	var ptr *int = &num
	fmt.Println(ptr)
	//ptr本身也有一个地址
	fmt.Println(&ptr)
	//获取指针类型(指针变量)所指向的值
	fmt.Println(*ptr)

}
