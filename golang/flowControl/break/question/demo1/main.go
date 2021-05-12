package main

import "fmt"

func main() {
	var username string
	var password string
	var errorCount = 3
	for {
		fmt.Print("请输入账号:\n")
		fmt.Scanf("%v", &username)
		fmt.Print("请输入密码:\n")
		fmt.Scanf("%v", &password)

		if username == "test" && password == "111111" {
			fmt.Print("登录成功:\n")
			break
		} else {
			errorCount--
			if errorCount <= 0 {
				fmt.Print("错误次数过多，账号已被禁用:\n")
				break
			}
			fmt.Printf("输入错误，你还有%d次机会", errorCount)
		}
	}
}
