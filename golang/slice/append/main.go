package main

import "fmt"

func main() {
	slice := []string{"str1", "str2", "str3"}
	fmt.Printf("slice=%v;slice地址=%p\n", slice, &slice)
	//append追加元素
	slice = append(slice, "str4")
	fmt.Printf("slice=%v;slice地址=%p\n", slice, &slice)
	//append追加多个元素
	slice = append(slice, "str5", "str6")
	fmt.Printf("slice=%v;slice地址=%p\n", slice, &slice)
	//append追加切片
	slice = append(slice, slice...)
	fmt.Printf("slice=%v;slice地址=%p\n", slice, &slice)
	sliceTemp := []string{"str7", "str8", "str9"}
	slice = append(slice, sliceTemp...)
	fmt.Printf("slice=%v;slice地址=%p\n", slice, &slice)

}
