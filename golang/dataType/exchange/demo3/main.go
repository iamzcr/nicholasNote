package main

import (
	"fmt"
	"strconv"
)

func main() {
	var num1 int = 6
	var num2 float64 = 6.2623
	var num3 int = 666

	var b bool = true
	var str string
	//要转换的值，以十进制转换
	str = strconv.FormatInt(int64(num1), 10)
	fmt.Printf("str = %q;str = %T\n", str, str)
	//要转换的值，f形式，保留小数位10位，这个小数为float64
	str = strconv.FormatFloat(num2, 'f', 10, 64)
	fmt.Printf("str = %q;str = %T\n", str, str)
	//要转换的值
	str = strconv.FormatBool(b)
	fmt.Printf("str = %q;str = %T\n", str, str)

	//要转换的值
	str = strconv.Itoa(num3)
	fmt.Printf("str = %q;str = %T\n", str, str)
}
