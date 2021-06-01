package main

import "fmt"

func main() {
	intChan := make(chan int, 10)
	for i := 0; i < 10; i++ {
		intChan <- i
	}
	stringChan := make(chan string, 5)
	for i := 0; i < 5; i++ {
		stringChan <- "hello" + fmt.Sprintf("%d", i)
	}
	//传统的方法在遍历管道是，如果不关闭会阻塞导致死锁

	//在实际开发中，不好确定什么时候关闭管道
	//使用select方式解决
	label:
	for {
		select {
		case v := <-intChan: //如果按这种方式来获取数据，不关闭，也不会一直阻塞致死锁。如果取不到数据，会下个case匹配
			fmt.Printf("从intChan读取了数据%d\n", v)
		case v := <-stringChan: //如果按这种方式来获取数据，不关闭，也不会一直阻塞导致死锁。如果取不到数据，会下个case匹配
			fmt.Printf("stringChan读取了数据%v\n", v)
		default:
			fmt.Printf("都取不到，加入业务逻辑\n")
			//return
			break label//可以用label退出，但是不推荐，最好用return
		}
	}
}
