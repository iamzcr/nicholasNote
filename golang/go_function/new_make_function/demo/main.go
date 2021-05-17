package main

import "fmt"

func main() {
	num1 := 100
	fmt.Printf("num1的值---%v；num1的类型---%T；num1的地址---%v\n", num1, num1, &num1)

	num2 := new(int)
	fmt.Printf("num2指向的值---%v；num2的值---%v；num2的类型---%T；num2的地址---%v\n", *num2, num2, num2, &num2)
	*num2 = 50
	fmt.Printf("num2指向的值---%v；num2的值---%v；num2的类型---%T；num2的地址---%v\n", *num2, num2, num2, &num2)

}
