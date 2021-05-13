package main

import "fmt"

func main() {
	sum := test(1, 1, 2, 31, 2, 31, 2, 31, 2, 31, 2, 3)
	sum1 := test(1)
	fmt.Println(sum)
	fmt.Println(sum1)
}
func test(num1 int, args ...int) int {
	sum := num1
	for i := 0; i < len(args); i++ {
		sum += args[i]
	}
	return sum
}
