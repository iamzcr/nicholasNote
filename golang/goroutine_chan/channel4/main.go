package main

import "fmt"

func main() {
	//var chan1  chan int //读写
	var chan2 chan<- int //只写
	chan2 = make(chan int, 3)
	chan2 <- 2
	var chan3 <-chan int //只读
	chan3 = make(chan int, 3)
	num := <-chan3
	fmt.Println(num)
}
