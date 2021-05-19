package main

import "fmt"

func main() {
	//var arr [2]int
	//var index int = 3
	//arr[index] = 6 //编译器不报错，但是运行会越界
	var arr = [3]int{0, 1, 3}
	fmt.Printf("%v\n", arr)
	//数组值传递
	test(arr)
	fmt.Printf("%v\n", arr)

	var arr1 = [3]int{5, 6, 7}
	fmt.Printf("%v\n", arr1)
	//数组引用传递
	test1(&arr1)
	fmt.Printf("%v\n", arr1)
}

//数组引用传递
func test1(arr1 *[3]int) {
	(*arr1)[0] = 99
}

//数组值传递
func test(arr [3]int) {
	arr[0] = 88
}
