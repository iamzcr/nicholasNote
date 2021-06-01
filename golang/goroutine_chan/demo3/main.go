//并发执行阶乘
package main

import (
	"fmt"
	"sync"
	"time"
)

var (
	myMap = make(map[int]int64, 10)
	//声明一个全局互斥锁，Mutex是个互斥锁结构体
	lock sync.Mutex
)

func test(n int) {
	res := 1
	for i := 1; i <= n; i++ {
		res *= i
	}
	//给myMap加锁
	lock.Lock()
	myMap[n] = int64(res)
	//给myMap解锁
	lock.Unlock()
}
func main() {
	for i := 1; i <= 20; i++ {
		go test(i)
	}
	//这里这样处理并不能保证go协程多少秒后执行完毕，如果没执行完毕，就往下执行主线程，主线程执行完，协程将会推出，会有问题
	time.Sleep(time.Second * 10)
	//主线程不知道10后可以执行完协程的任务，所以仍然可能出现资源竞争，所以这里也需要加入互斥锁
	lock.Lock()
	for index, value := range myMap {
		fmt.Printf("index=%v,value=%v\n", index, value)
	}
	lock.Unlock()
}
