package main

import "fmt"

func main() {
	slice := []int{1, 2, 3}
	var copySlice = make([]int, 10)

	fmt.Printf("copySlice=%v;copySlice=%p\n", copySlice, &copySlice)
	copy(copySlice, slice)
	fmt.Printf("copySlice=%v;copySlice=%p\n", copySlice, &copySlice)
	//虽然长度是1，去拷贝，仍然不会报错
	var copySlice1 = make([]int, 1)
	copy(copySlice1, slice)
	fmt.Printf("copySlice1=%v;copySlice1=%p\n", copySlice1, &copySlice1)

}
