package main

import "fmt"

func main() {
	var b byte
	fmt.Println("请输入字符：")
	_, err := fmt.Scanf("%c", &b)
	if err != nil {
		fmt.Println(err)
	}
	switch b {
	case 'a':
		fmt.Println("星期1")
	case 'b':
		fmt.Println("星期2")
	default:
		fmt.Println("error")
	}
}
