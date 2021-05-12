package main

import "fmt"

func main() {
	num := 10
	fmt.Println("success")
	if num > 20 {
		goto lable
	}
	fmt.Println("success1")
lable:
	fmt.Println("success3")
}
