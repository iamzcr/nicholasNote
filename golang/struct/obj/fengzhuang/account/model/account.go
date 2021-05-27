package model

import "fmt"

type account struct {
	accontNo string
	balance  float64
	password string
}

func NewAccount(accontNo string, balance float64, password string) *account {
	if len(accontNo) < 6 || len(accontNo) > 10 {
		fmt.Println("输入账号有误")
		return nil
	}
	if len(password) != 6 {
		fmt.Println("密码不正确")
		return nil
	}
	if balance < 20 {
		fmt.Println("余额不正确")
		return nil
	}
	account := &account{
		accontNo: accontNo,
		balance:  balance,
		password: password,
	}
	return account
}
func (a *account) SetAccontNo(accontNo string) {
	if len(accontNo) >= 6 && len(accontNo) <= 10 {
		a.accontNo = accontNo
	} else {
		fmt.Println("输入账号有误")
	}
}
func (a *account) SetPassword(password string) {
	if len(password) == 6 {
		a.password = password
	} else {
		fmt.Println("密码不正确")
	}
}

func (a *account) SetBalance(balance float64) {
	if balance > 20 {
		a.balance = balance
	} else {
		fmt.Println("余额不正确")
	}
}
