package main

import (
	"fmt"
	"io/ioutil"
)

func main() {
	//ioutil.ReadFile封装了Open和Close，不需要执行这两个方法
	FileData, err := ioutil.ReadFile("F:/go/src/golangStudy/file_opt/test.txt")
	if err != nil {
		fmt.Println(err)
	}
	fmt.Printf("%s", FileData)
	fmt.Printf("%s", string(FileData))//字符串输出
}
