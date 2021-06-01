package main

import (
	"fmt"
	"strconv"
	"time"
)

func test() {
	for i := 1; i < 5; i++ {
		fmt.Println("hello world" + strconv.Itoa(i))
		time.Sleep(time.Second) //休眠一秒
	}
}

func main() {
	//test()//这样调用，先走完test再走下面的for循环
	//加上go关键词，开启一个协程，
	//如果主线程退出了，就算协程还没有执行完毕，也会退出，比如说上面的test循环改成100次，肯定是主线程先执行完，退出了，协程也会退出
	//协程也可以在主线程没有退出前，就自己结束，也就是完成了自己的任务
	go test()
	for i := 1; i < 10; i++ {
		fmt.Println("hello go" + strconv.Itoa(i))
		time.Sleep(time.Second) //休眠一秒
	}
}
