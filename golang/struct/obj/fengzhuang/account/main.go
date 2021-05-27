package main

import (
	"fmt"
	"golangStudy/struct/obj/fengzhuang/account/model"
)

func main() {
	account := model.NewAccount("555555", 10, "555555")
	if account != nil {
		fmt.Println(account)
		account.SetAccontNo("555555")
		account.SetPassword("555555")
		account.SetBalance(50)
	} else {
		fmt.Println("创建失败")
	}

}
