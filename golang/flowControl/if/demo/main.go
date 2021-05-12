package main

import "fmt"

func main() {
	var age int
	fmt.Println("请输入年龄：")
	_, err := fmt.Scanln(&age)
	if err != nil {
		return
	}
	if age > 18 {
		fmt.Println("年龄大于18")
	} else {
		fmt.Println("年龄不大于18")
	}

	if sex := 1; sex == 1 {
		fmt.Println("sex:", sex)
	}
}
