package main

import "fmt"

func main() {
	str := "hello world"
	slice := str[1:9]
	fmt.Printf("slice=%v;slice地址=%p\n", slice, &slice)

	//修改字符串
	changeSlice := []byte(str)
	fmt.Println(changeSlice)
	changeSlice[0] = 'z'
	str = string(changeSlice)
	fmt.Printf("str=%v;str地址=%p\n", str, &str)
	//修改成中文字符串
	changeSlice1 := []rune(str)
	changeSlice1[0] = '中'
	str = string(changeSlice1)
	fmt.Printf("str=%v;str地址=%p\n", str, &str)

}
