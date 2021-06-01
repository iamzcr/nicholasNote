package main

import (
	"fmt"
	"time"
)

func writeChan(intChan chan int) {

	for i := 1; i <= 50; i++ {
		fmt.Printf("写入一个数据=%v\n", i)
		intChan <- i
	}
	//写完后关闭，不影响读，不close，读取的时候会死锁
	close(intChan)
}
func readChan(intChan chan int, exitChan chan bool) {
	for {
		v, ok := <-intChan
		if !ok {
			break
		}
		time.Sleep(time.Second)
		fmt.Printf("读取一个数据=%v\n", v)
	}
	//读取完数据后，即任务完成后
	exitChan <- true
	//写完后关闭，不影响读，不close，读取的时候会死锁
	close(exitChan)
}
func main() {
	intChan := make(chan int, 10)
	exitChan := make(chan bool, 1)
	go writeChan(intChan)
	//如果把下面的注销了，intChan的容量比写入的容量要少，又没有读取操作，会出现写进去的时候死锁，而且exitChan没有关闭，也会发生死锁
	go readChan(intChan, exitChan)
	for {
		_, ok := <-exitChan
		if !ok {
			break
		}
	}
}
