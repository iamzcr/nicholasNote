package main

import "fmt"

func main() {
	//如果参与除法运算的都是整数，计算后去掉小数部分，留下整数，下面结果是2，不是2.5
	fmt.Println(10 / 4)
	var num float64 = 10 / 4
	fmt.Println(num)
	//如果希望保留小数部分，除法运算里面要有一个是小数
	fmt.Println(10.0 / 4)
	//取模运算
	//a % b = a - a / b * b
	fmt.Println(10 % 3)
	fmt.Println(-10 % 3) // -10 - (-10) / 3 * 3 = -10 - (-9) = -1
	// ++ ,--,go只有i++，i--，没有--i，++i

	var i int = 10
	i++ // i=i+1
	fmt.Println(i)
	i-- // i=i-1
	fmt.Println(i)
	//自增自减只能独立使用
	//var b  int
	//b = i--

}
