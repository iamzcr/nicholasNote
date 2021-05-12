package main

import "fmt"

func main() {
lable1:
	for i := 0; i < 4; i++ {
		//lable2:
		for j := 0; j < 10; j++ {
			if j == 2 {
				//continue//默认跳出最近的循环的本次循环
				continue lable1 //加上一个标签，指定跳出哪个循环的本次循环
				//continue lable2
			}
			fmt.Println("j=", j)
		}
	}
}
