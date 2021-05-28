package util

import "fmt"

type Account struct {
	key     string
	loop    bool
	balance float64
	money   float64
	flag    bool
	note    string
	detail  string
}

func NewAccount() *Account {
	return &Account{
		key:     "",
		loop:    true,
		balance: 0,
		money:   0,
		flag:    false,
		note:    "",
		detail:  "类型\t金额\t余额\t说明",
	}

}
func (a *Account) ShowDetail() {
	fmt.Println("1：查看明细")
	if a.flag {
		fmt.Println(a.detail)
	} else {
		fmt.Println("暂无记录，请登记一笔记录")
	}
}
func (a *Account) Add() {
	fmt.Println("输入收入金额...")
	fmt.Scanln(&a.money)
	a.balance += a.money
	fmt.Println("输入收入说明...")
	fmt.Scanln(&a.note)
	a.detail += fmt.Sprintf("\n%v\t%v\t%v\t%v\t", "收入", a.money, a.balance, a.note)
	a.flag = true
}
func (a Account) Del() {
	fmt.Println("输入支出金额...")
	fmt.Scanln(&a.money)
	if a.money > a.balance {
		fmt.Println("余额不足...")
	}
	a.balance -= a.money
	fmt.Println("输入支出说明...")
	fmt.Scanln(&a.note)
	a.detail += fmt.Sprintf("\n%v\t%v\t%v\t%v\t", "支出", a.money, a.balance, a.note)
	a.flag = true
}

func (a Account) Exit() {
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
		a.loop = false
	}
}
func (a Account) MainMenu() {
	for {
		fmt.Println("收入支出登记")
		fmt.Println("1：查看明细")
		fmt.Println("2：登记收入")
		fmt.Println("3：登记支出")
		fmt.Println("4：退出")
		fmt.Println("请选择1-4")
		fmt.Scanln(&a.key)
		switch a.key {
		case "1":
			a.ShowDetail()
		case "2":
			a.Add()
		case "3":
			a.Del()
		case "4":
			a.Exit()
		default:
			fmt.Println("3输入有误")
		}
		if !a.loop {
			break
		}
	}
}
