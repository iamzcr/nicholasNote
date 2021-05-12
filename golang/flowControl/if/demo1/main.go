package main

import "fmt"

func main() {
	var grade int
	fmt.Println("请输入分数：")
	_, err := fmt.Scanln(&grade)
	fmt.Println(err)
	if grade == 100 {
		fmt.Println("perfect")
	} else if grade > 80 && grade <= 99 {
		fmt.Println("good")
	} else if grade > 60 && grade <= 80 {
		fmt.Println("warning")
	} else {
		fmt.Println("fail")
	}

	var b bool = true
	if b == false{
		fmt.Println("success")
	}
}
