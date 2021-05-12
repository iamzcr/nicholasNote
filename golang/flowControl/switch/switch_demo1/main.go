package main

import "fmt"

func main() {
	var num1 = 40
	switch num1 {
	case 40:
		fmt.Println("success one")
		fallthrough
	case 50:
		fmt.Println("success two")
	case 60:
		fmt.Println("success three")
	default:
		fmt.Println("fail")
	}
}
