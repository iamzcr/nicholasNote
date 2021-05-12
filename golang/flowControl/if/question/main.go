package main

import "fmt"

func main() {
	var a, b int

	fmt.Println("请输入a：")
	_, err := fmt.Scanln(&a)
	fmt.Println(err)

	fmt.Println("请输入a：")
	_, err = fmt.Scanln(&b)
	fmt.Println(err)

	if a+b > 50 {
		fmt.Println("ok")
	}

	var num1, num2 float64

	fmt.Println("请输入num1：")
	_, err = fmt.Scanln(&num1)
	fmt.Println(err)

	fmt.Println("请输入num2：")
	_, err = fmt.Scanln(&num2)
	fmt.Println(err)
	if num1 > 10.0 && num2 < 20.0 {
		fmt.Println(num1 + num2)
	}

	num3, num4 := 10, 5
	if (num3+num4)%3 == 0 && (num3+num4)%5 == 0 {
		fmt.Println("success")
	}
	year := 2004
	if (year%4 == 0 && year%100 != 0) || year%400 == 0 {
		fmt.Println("success")
	}
}
