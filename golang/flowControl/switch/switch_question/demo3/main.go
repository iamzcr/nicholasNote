package main

import "fmt"

func main() {
	var month byte
	fmt.Println("请输入月份：")
	_, err := fmt.Scanln(&month)
	if err != nil {
		fmt.Println(err)
	}
	fmt.Printf("%d", month)
	switch month {
	case 1, 2, 12:
		fmt.Println("冬季")
	case 3, 4, 5:
		fmt.Println("春季")
	case 6, 7, 8:
		fmt.Println("夏季")
	case 9, 10, 11:
		fmt.Println("秋季")
	default:
		fmt.Println("输入有误")
	}
}
