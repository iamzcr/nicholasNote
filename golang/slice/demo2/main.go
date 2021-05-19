package main

import "fmt"

func main() {

	arr := [5]string{"str1", "str2", "str3", "str4", "str5"}
	//第0个开始，到第4个结束，不包括第4个元素
	arrSlice := arr[:4]
	arrSlice3 := arrSlice[1:3]
	//第1个开始，到数组最大长度结束
	arrSlice1 := arr[1:]
	//第0个开始，到数组最大长度结束
	arrSlice2 := arr[:]
	fmt.Printf("arr=%v\n",arr)
	fmt.Printf("arrSlice=%v\n",arrSlice)
	fmt.Printf("arrSlice1=%v\n",arrSlice1)
	fmt.Printf("arrSlice2=%v\n",arrSlice2)
	fmt.Printf("arrSlice3=%v\n",arrSlice3)
}
