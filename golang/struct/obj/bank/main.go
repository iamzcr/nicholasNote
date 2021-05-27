package main

import "fmt"

type Account struct {
	Username string
	Pwd      string
	Balance  float64
}

func (account *Account) SaveMoney(money float64, pwd string) {
	if pwd != account.Pwd {
		fmt.Printf("密码不正确\n")
		return
	}
	if money <= 0 {
		fmt.Printf("存款不正确\n")
		return
	}
	account.Balance += money
	fmt.Printf("存款成功\n")
	fmt.Printf("你的账号是%v，余额是%v\n", account.Username, account.Balance)
}
func (account *Account) GetMoney(money float64, pwd string) {
	if pwd != account.Pwd {
		fmt.Printf("密码不正确\n")
		return
	}
	if money <= 0 || money > account.Balance {
		fmt.Printf("取款不正确\n")
		return
	}
	account.Balance -= money
	fmt.Printf("取款成功\n")
	fmt.Printf("你的账号是%v，余额是%v\n", account.Username, account.Balance)

}
func (account *Account) CheckMoney(pwd string) {
	if pwd != account.Pwd {
		fmt.Println("密码不正确\n")
		return
	}

	fmt.Printf("你的账号是%v，余额是%v\n", account.Username, account.Balance)

}
func main() {
	account := &Account{
		Username: "1111111",
		Pwd:      "11111",
		Balance:  50,
	}
	account.CheckMoney("11111")
	account.SaveMoney(200, "11111")
	account.GetMoney(150, "11111")

}
