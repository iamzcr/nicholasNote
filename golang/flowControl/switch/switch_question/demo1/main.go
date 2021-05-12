package main

import "fmt"

func main() {
	var char byte
	fmt.Println("请输入字符：")
	_, err := fmt.Scanf("%c", &char)
	if err != nil {
		fmt.Println(err)
	}
	switch char {
	case 'a':
		fmt.Println("A")
	case 'b':
		fmt.Println("B")
	case 'c':
		fmt.Println("C")
	case 'd':
		fmt.Println("D")
	case 'e':
		fmt.Println("E")
	default:
		fmt.Println("other")
	}
}
