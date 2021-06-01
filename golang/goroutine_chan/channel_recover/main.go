package main

import (
	"fmt"
	"time"
)

func sayHello() {
	for i := 0; i < 10; i++ {
		time.Sleep(time.Second)
		fmt.Println("hello world")
	}
}
func test() {
	defer func() {
		err := recover()
		if err != nil {
			fmt.Println("err=", err)
		}
	}()
	var myMap map[int]string
	myMap[0] = "test"
}
func main() {
	go sayHello()
	//go协程中使用recover，解决协程中出现panic，导致程序崩溃问题
	go test()

	for i := 0; i < 10; i++ {
		fmt.Println("main success")
		time.Sleep(time.Second)
	}

}
