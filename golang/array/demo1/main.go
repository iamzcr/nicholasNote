package main

import "fmt"

func main() {
	var arr [3]int
	arr[0] = 12
	arr[1] = 10
	arr[2] = 16
	fmt.Printf("数组首个元素的地址是：%p\n", &arr[0])
	//数组本身元素的地址是上一个元素地址加上本身元素占用的字节数,例如int占8个字节，如果&arr[0]的地址是0xc00000e360，那么&arr[1]就是0xc00000e368
	fmt.Printf("数组第二个元素的地址是：%p\n", &arr[1])
	fmt.Printf("数组第三个元素的地址是：%p\n", &arr[2])
}
