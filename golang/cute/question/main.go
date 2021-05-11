package main

import "fmt"

func main() {
	var i int = 97
	week := i / 7
	day := i % 7
	fmt.Printf("还有%d星期，%d天放假", week, day)

	var huashi float32 = 134.2
	var sheshi float32 = 5.0 / 9 * (huashi - 100)
	fmt.Printf("摄氏温度：%v", sheshi)
}
