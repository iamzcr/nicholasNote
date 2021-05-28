package main

import (
	"fmt"
	"io/ioutil"
	"os"
)

func main() {
	file1 := "F:/go/src/golangStudy/file_opt/you.txt"
	file2 := "F:/go/src/golangStudy/file_opt/my.txt"

	data, err := ioutil.ReadFile(file1)
	if err != nil {
		fmt.Println(err)
	}
	err = ioutil.WriteFile(file2, data, 0666)
	if err != nil {
		fmt.Println(err)

	}
}

func checkFile(path string) (bool, error) {
	_, err := os.Stat(path)
	if err == nil {
		return true, nil
	}
	//如果需要返回错误类型，使用os.IsNotExist方法判断err为true，说明文件或文件夹不存在
	if os.IsNotExist(err) {
		return false, nil
	}
	//否则直接返回错误
	return false, err
}
