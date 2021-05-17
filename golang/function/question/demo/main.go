package main

import "fmt"
func main() {
	//1,1,2,3,5,8,13,21,34,55
	//第十个斐波那数是55
	//num := 10
	//fmt.Println(fbn(num))
	fmt.Println(test(2))
	fmt.Println(test(3))
	fmt.Println(test(4))
	fmt.Println(test(5))
}
func fbn(num int) int {
	if num == 1 || num == 2 {
		return 1
	} else {
		return fbn(num-1) + fbn(num-2)
	}
}

func test(num int) int {
	if num == 1 {
		return 3
	} else {
		return 2*test(num-1) + 1
	}
}
