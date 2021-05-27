package main

import "fmt"

type Cat struct {
	Name string
	Age int
	Color string
	Slice []int
}

func main()  {
	var cat  Cat
	cat.Name = "test"
	cat.Age = 11
	cat.Color = "test"
	fmt.Println(cat)
	//cat.Slice[0]  = 1//直接使用会报错，必须要分配指向的空间
	cat.Slice = make([]int,10)
	fmt.Println(cat)

}