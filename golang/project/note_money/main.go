package main

import "fmt"

func main() {
	var key = ""
	var loop = true
	var balance float64 = 0
	var money float64 = 0
	var flag = false
	var note = ""
	var detail = "类型\t金额\t余额\t说明"
	for {
		fmt.Println("收入支出登记")
		fmt.Println("1：查看明细")
		fmt.Println("2：登记收入")
		fmt.Println("3：登记支出")
		fmt.Println("4：退出")
		fmt.Println("请选择1-4")
		fmt.Scanln(&key)
		switch key {
		case "1":
			fmt.Println("1：查看明细")
			if flag {
				fmt.Println(detail)
			} else {
				fmt.Println("暂无记录，请登记一笔记录")
			}
		case "2":
			fmt.Println("输入收入金额...")
			fmt.Scanln(&money)
			balance += money
			fmt.Println("输入收入说明...")
			fmt.Scanln(&note)
			detail += fmt.Sprintf("\n%v\t%v\t%v\t%v\t", "收入", money, balance, note)
			flag = true
		case "3":
			fmt.Println("输入支出金额...")
			fmt.Scanln(&money)
			if money > balance {
				fmt.Println("余额不足...")
				break
			}
			balance -= money
			fmt.Println("输入支出说明...")
			fmt.Scanln(&note)
			detail += fmt.Sprintf("\n%v\t%v\t%v\t%v\t", "支出", money, balance, note)
			flag = true

		case "4":
			fmt.Println("你确定要退出吗？y/n")
			choice := ""
			for {
				fmt.Scanln(&choice)
				if choice == "y" || choice == "n" {
					break
				}
				fmt.Println("输入有误，请重新输入4？y/n")
			}
			if choice == "y" {
				loop = false
			}
		default:
			fmt.Println("3输入有误")
		}
		if !loop {
			break
		}

	}
	fmt.Println("退出收入支出登记的使用")

}
