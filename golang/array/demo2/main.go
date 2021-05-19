package main

import "fmt"

func main() {
	var score [5]float64
	for i := 0; i < len(score); i++ {
		fmt.Printf("请输入第%d个元素\n", i)
		fmt.Scanln(&score[i])
	}
	for i := 0; i < len(score); i++ {
		fmt.Printf("第%d个元素值是%v\n", i, score[i])
	}
}
