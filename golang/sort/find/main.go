package main

import "fmt"

func main() {

	arr := []string{"test1", "test2", "test3", "test4", "test5"}
	var searchStr = ""
	fmt.Println("请输入要查找的字符串...")
	fmt.Scanln(&searchStr)
	//方式一
	for i := 0; i < len(arr); i++ {
		if searchStr == arr[i] {
			fmt.Printf("找到字符串为%v,下标为%v\n", searchStr, i)
			break
		} else if i == len(arr)-1 {
			fmt.Printf("找不到字符串%v\n", searchStr)
		}
	}
	//方式二
	index := -1
	for i := 0; i < len(arr); i++ {
		if searchStr == arr[i] {
			index = 1
			break
		}
	}
	if index != -1 {
		fmt.Printf("找到字符串为%v,下标为%v\n", searchStr, index)
	} else {
		fmt.Printf("找不到字符串%v\n", searchStr)
	}

}
