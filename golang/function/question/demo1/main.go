package main

import "fmt"

//有一堆桃子，猴子每天吃桃子总数的一半并多吃一个。吃了10天，到第11天只剩一个桃子。问，猴子吃之前，一共是多少个桃子。
func main() {
	fmt.Println(test(1))
}
func test(day int) int {
	if day > 10 || day < 1 {
		return 0
	}
	if day == 10 {
		return 1
	} else {
		return (test(day+1) + 1) * 2
	}
}
