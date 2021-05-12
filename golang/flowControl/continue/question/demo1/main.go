package main

import "fmt"

func main() {
	var pCount int
	var mCount int
	var num int

	for {
		fmt.Println("请输入一个整数：")
		fmt.Scanln(&num)
		if num == 0 {
			break
		}
		if num > 0 {
			pCount++
			continue
		}
		mCount++
	}
	fmt.Printf("正数个数为：%d;负数个数为：%d", pCount, mCount)
}
