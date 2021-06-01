package main

import "fmt"

func main() {

	var strChan chan string
	strChan = make(chan string, 100)
	strChan <- "test"
	strChan <- "test1"
	close(strChan)
	//关闭后再写入，报错panic: send on closed channel
	//strChan <- "test1"
	//关闭后可以读取
	str := <-strChan
	fmt.Printf("%v\n", str)

	var intChan chan int
	intChan = make(chan int, 100)
	for i := 1; i < cap(intChan); i++ {
		intChan <- i + 1
	}
	//channel遍历的时候，如果channel关闭了，则会正常遍历数据，遍历完后，退出遍历
	close(intChan)
	for value := range intChan {
		fmt.Printf("%v\n", value)
	}
}
