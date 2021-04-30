package main

import (
	"fmt"
	"strconv"
)

func main() {

	var str string = "true"
	var b bool
	b, _ = strconv.ParseBool(str)
	fmt.Printf("b = %v;b = %T\n", b, b)

	var str1 string = "99"
	var num1 int64
	//bitSize可认为实际上做了校验的功能,防止数据越界
	num1, _ = strconv.ParseInt(str1, 10, 0)
	fmt.Printf("num1 = %v;num1 = %T\n", num1, num1)

	var num2 int
	num2, _ = strconv.Atoi(str1)
	fmt.Printf("num2 = %v;num2 = %T\n", num2, num2)

	var str3 string = "99.099"
	var f float64
	f, _ = strconv.ParseFloat(str3,64)
	fmt.Printf("f = %v;f = %T\n", f, f)
}
