package main

import "fmt"

func main() {
	slice := []string{"str1", "str2", "str3", "str4"}
	for i := 0; i < len(slice); i++ {
		fmt.Printf("切片slice的第%d个元素是%v\n", i, slice[i])
	}
	arr := [5]string{"str1", "str2", "str3", "str4", "str5"}
	arrSlice := arr[1:4]
	for i := 0; i < len(arrSlice); i++ {
		fmt.Printf("切片arrSlice的第%d个元素是%v\n", i, arrSlice[i])
	}
	for index, value := range arrSlice {
		fmt.Printf("切片arrSlice的第%d个元素是%v\n", index, value)
	}
}
