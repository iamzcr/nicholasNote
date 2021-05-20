package main

import "fmt"

func main() {

	myArr := [...]int{1, 323, 3, 6, 7}
	mySlice := myArr[1:3]
	fmt.Printf("mySlice %v\n", mySlice)

	//初始化一个长度为4，容量为8的切片，容量可省略不写
	var makeSlice []int = make([]int, 4, 8)
	fmt.Printf("makeSlice %v\n", makeSlice)
	//初始化一个长度为4，容量为8的切片，容量可省略不写
	var arrSlice []int = []int{1,2,6}
	fmt.Printf("arrSlice %v\n", arrSlice)

	//定义一个数组
	arr := [...]int{1, 323, 3, 6, 7}
	fmt.Printf("arr %v\n", arr)
	//定义一个切片，arr[1:3]表示引用arr这个数组
	//引用arr数组起始下标是1，最后下标为3(不包含3)
	slice := arr[1:3]
	fmt.Printf("arr[1]的地址 %p\n", &arr[1])
	fmt.Printf("arr[2]的地址 %p\n", &arr[2])
	fmt.Printf("slice[0]元素是： %v,slice[0]地址是： %p\n", slice[0], &slice[0])
	fmt.Printf("slice[1]元素是： %v,slice[1]地址是： %p\n", slice[1], &slice[1])
	fmt.Printf("slice本身的地址 %p\n", &slice)
	//因为slice是对arr的一个引用，所以修改slice会影响到arr
	slice[1] = 666
	fmt.Printf("arr %v\n", arr)
	fmt.Printf("slice的元素=%v\n", slice)
	fmt.Printf("slice的元素个数=%v\n", len(slice))
	//容量：切面目前可以存放最多元素的个数，容量可以动态变化,一般是长度的两倍
	fmt.Printf("slice的容量=%v\n", cap(slice))

}
