package main

import "fmt"

func main() {
	sum := 0
	i := 0
	for ; i <= 100; i++ {
		sum += i
		if sum > 20 {
			break
		}
	}
	fmt.Printf("第一次大于20的当前数是%d", i)
}
