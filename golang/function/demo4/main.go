package main

import "fmt"

func main() {
	fmt.Println(getSum(1, 2))
}
func getSum(num1 int, num2 int) (sum int) {
	sum = (num1 + num2)
	return
}
