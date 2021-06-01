package main

import "fmt"

func main() {
	var intChan chan int
	//写入数据时候，不能超过一开始初始化的时候定义的容量
	intChan = make(chan int, 10)
	//channel是引用类型，指向一个地址
	fmt.Printf("%v\n", intChan)
	intChan <- 10
	intChan <- 55
	intChan <- 66
	intChan <- 88
	num := 200
	intChan <- num
	fmt.Printf("len =%v；cap=%v\n", len(intChan), cap(intChan))

	<-intChan //可以取出不接受
	fmt.Printf("len =%v；cap=%v\n", len(intChan), cap(intChan))

	num2 := <-intChan
	fmt.Printf("num2=%v\n", num2)
	num3 := <-intChan
	fmt.Printf("num3=%v\n", num3)
	//在没有使用协程的情况下，如果chan全部取出，没有数据了，继续取会死锁deadlock
	num4 := <-intChan
	fmt.Printf("num4=%v\n", num4)

	fmt.Printf("len =%v；cap=%v\n", len(intChan), cap(intChan))

}
