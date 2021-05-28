package main

import (
	"fmt"
	"os"
)

func main() {
	//返回的是文件对象也叫file指针，或者file文件句柄
	file, err := os.Open("F:/go/src/golangStudy/file_opt/test.txt")
	if err != nil {
		fmt.Println(err)
	}
	fmt.Printf("%v", file)
	err = file.Close()
	if err != nil {
		fmt.Println("关闭文件错误")
	}
}
