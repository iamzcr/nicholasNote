package main

import "fmt"

func main() {
	var num = 5 //金字塔多少层
	for i := 1; i <= num; i++ {
		//空格=总层数-当前第几层
		for k := 1; k <= num-i; k++ {
			fmt.Print(" ")
		}
		//*数= 2*第几层-1
		for j := 1; j <= 2*i-1; j++ {
			fmt.Print("*")
		}
		fmt.Println()
	}
	for i := 1; i <= num-1; i++ {
		for j := 1; j <= i; j++ {
			fmt.Print(" ")
		}
		for k := 2*num - 3; k >= 2*i-1; k-- {
			fmt.Print("*")
		}
		fmt.Println()
	}

}
