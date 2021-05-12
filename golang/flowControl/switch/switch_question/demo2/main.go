package main

import "fmt"

func main() {
	var grade float64
	fmt.Println("请输入分数：")
	_, err := fmt.Scanf("%f", &grade)
	if err != nil {
		fmt.Println(err)
	}
	switch int(grade / 60) {
	case 1:
		fmt.Println("合格")
	case 0:
		fmt.Println("不合格")
	default:
		fmt.Println("分数输入有误")
	}
}
