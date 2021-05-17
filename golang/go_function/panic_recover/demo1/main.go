package main

import (
	"errors"
	"fmt"
)

func readConfig(name string) (err error) {
	if name == "test.ini" {
		return nil
	} else {
		//返回自定义错误
		return errors.New("读取配置文件错误")
	}
}
func test() {
	err := readConfig("test.yml")
	if err != nil {
		//使用panic终止程序
		panic(err)
	}
	fmt.Println("继续执行test....")
}
func main() {
	test()
	fmt.Println("继续执行main....")
}
