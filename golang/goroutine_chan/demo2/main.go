//并发执行阶乘
package main

import (
	"fmt"
	"time"
)

var myMap = make(map[int]int, 10)

func test(n int) {
	res := 1
	for i := 1; i <= n; i++ {
		res *= i
	}
	myMap[n] = res
}
func main() {
	//起两百个协程去计算每个数的阶乘,直接起协程去处理会有资源竞争问题，编译加上-race，执行编译完的文件会报如下错误Found 2 data race(s)
	for i := 1; i <= 200; i++ {
		go test(i)
	}
	time.Sleep(time.Second * 10)
	for index, value := range myMap {
		fmt.Printf("index=%v,value=%v\n", index, value)
	}
}
