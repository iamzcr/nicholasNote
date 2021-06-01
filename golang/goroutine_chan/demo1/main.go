package main

import (
	"fmt"
	"runtime"
)

func main() {
	num := runtime.NumCPU()     //返回逻辑Cpu
	runtime.GOMAXPROCS(num - 1) //设置使用多少个cpu
	fmt.Println(num)
}
