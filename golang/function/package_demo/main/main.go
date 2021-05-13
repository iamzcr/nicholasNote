package main

import (
	"fmt"
	//"golangStudy/function/package_demo/utils"
	util "golangStudy/function/package_demo/utils"
)

func main() {
	num1, num2 := 2.9, 3.6
	var opt byte = '-'
	res := util.Cal(num1, num2, opt)
	fmt.Println(res)
}
