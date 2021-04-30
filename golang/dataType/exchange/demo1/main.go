package main

import "fmt"

func main() {
	var test int = 1
	fmt.Printf("%T\n", test)
	var test1 float32 = float32(test)
	//test被转换的是变量存储的数据(即值)，test变量本身的数据类型并没有发生变化,还是int
	fmt.Printf("%T,%T\n", test1, test)
	//在转换中，高精度转低精度，编译不会报错，转换结果按溢出处理，和我们想要的结果不一样
	var age int64 = 555333333
	var test3  = int8(age)
	fmt.Println(test3)
}
