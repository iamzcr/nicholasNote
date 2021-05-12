package main

import "fmt"

func main() {
	var month int
	var age int
	fmt.Println("请输入月份：")
	_, err := fmt.Scanln(&month)
	if err != nil {
		return
	}
	fmt.Println("请输入年龄：")
	_, err = fmt.Scanln(&age)
	if err != nil {
		return
	}
	if month >= 4 && month <= 10 {
		if age > 60 {
			fmt.Println("20")
		} else if age >= 18 {
			fmt.Println("60")
		} else {
			fmt.Println("30")
		}
	} else {
		if age >= 18 {
			fmt.Println("40")
		} else {
			fmt.Println("20")
		}
	}
}
