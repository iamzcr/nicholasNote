//求素数，除了1和本身能整除
package main

import (
	"fmt"
	"time"
)

func putNum(intChan chan int) {

	for i := 1; i <= 80000; i++ {
		intChan <- i
	}
	close(intChan)
}
func checkNum(intChan chan int, resChan chan int, exitChan chan bool, number int) {

	var flag bool
	for {
		num, ok := <-intChan
		//管道获取不到东西，当前协程退出
		if !ok {
			break
		}
		flag = true
		for i := 2; i < num; i++ {
			if num%i == 0 { //num不是素数
				flag = false
				break
			}
		}

		if flag {
			//放入存放素数的结果
			resChan <- num
		}
	}
	fmt.Printf("第%v个协程完成工作......\n", number)
	//这里不能关闭resChan管道，因为不知道其他协程是否完成
	exitChan <- true
}
func main() {
	intChan := make(chan int, 1000)
	resChan := make(chan int, 8000)
	//标识退出的管道
	exitChan := make(chan bool, 4)
	start := time.Now().Unix()
	//向intChan放入要判断的数
	go putNum(intChan)

	//检查并取出素数
	for i := 0; i < 4; i++ {
		go checkNum(intChan, resChan, exitChan, i)
	}

	//判断什么时候每个协程都处理完
	go func() {
		for i := 0; i < 4; i++ {
			<-exitChan
		}
		end := time.Now().Unix()
		fmt.Println("耗时=", end-start)
		close(resChan)
	}()

	//取出实际的结果
	for {
		res, ok := <-resChan
		if !ok {
			break
		}
		fmt.Printf("素数=%v\n", res)
	}
	fmt.Println("主线程退出")
}
