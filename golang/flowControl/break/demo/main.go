package main

import (
	"fmt"
	"math/rand"
	"time"
)

func main() {
	//time.Now(),返回一个time类型的值，time.Now().Unix()返回一个1970-01-01到现在的秒数，time.Now().UnixNano()纳秒
	//rand.Seed(time.Now().Unix())
	//n := rand.Intn(100)
	//fmt.Println(n)
	count := 0
	for {
		//rand.Seed(time.Now().Unix())
		rand.Seed(time.Now().UnixNano())
		n := rand.Intn(100)+1
		count++
		if n == 99 {
			break
		}
	}
	fmt.Printf("一共执行%d次", count)

}
