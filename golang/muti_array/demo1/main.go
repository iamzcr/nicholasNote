package main

import "fmt"

func main() {

	//如下二维数组再内存中存放其实是通过两个指针分别指向对应的一维数组
	var arr [2][3]int
	arr[1][2] = 1
	fmt.Printf("arr是%v\n", arr)
	fmt.Printf("arr[0]的地址是%p\n", &arr[0])
	fmt.Printf("arr[0]的指向一维数组的地址arr[0][0]是%p\n", &arr[0][0])
	fmt.Printf("arr[1]的地址是%p\n", &arr[1])
	fmt.Printf("arr[1]的指向一维数组的地址arr[1][0]是%p\n", &arr[1][0])

}
