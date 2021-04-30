package main

import (
	"fmt"
	"unsafe"
)

func main() {
	var a bool = false
	fmt.Printf("a数据类型是：%T，a占用的字节数是：%d\n", a,unsafe.Sizeof(a))
}
