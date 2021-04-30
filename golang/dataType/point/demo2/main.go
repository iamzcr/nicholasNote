package main

import "fmt"

func main() {
	var num int = 10
	fmt.Printf("num存放的地址——%v\n", &num)
	var ptr *int
	//把num的地址赋值给ptr指针变量
	ptr = &num
	//获取ptr指针的值，即获取指向num的地址，并修改num的值为100
	*ptr = 100
	fmt.Printf("num通过修改后的是存放的地址——%v\n", &num)
	fmt.Printf("num通过修改后的值是存放的地址——%v", num)

}
