package main

import "fmt"

func main() {
	arr := [...]string{1: "test", 2: "test1", 0: "test3"}
	//按下标顺序遍历
	for index, value := range arr {
		fmt.Printf("index=%v,value=%v\n", index, value)
	}
}
