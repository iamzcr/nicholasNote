package main

import "fmt"

func main() {
	//for i := 0; i <= 3; i++ {
	//	for j := 0; j <= 5; j++ {
	//		if j == 2 {
	//			break //中断/跳出最近的那个循环
	//		}
	//		fmt.Println("j=", j)
	//	}
	//}
lable1:
	for i := 0; i <= 3; i++ {
		//lable2:
		for j := 0; j <= 5; j++ {
			if j == 2 {
				break lable1 //加上一个标签，指定跳出哪个循环
			}
			fmt.Println("j =", j)
		}
	}
}
