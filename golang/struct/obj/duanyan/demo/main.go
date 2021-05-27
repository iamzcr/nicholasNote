package main

import "fmt"

type Point struct {
	x int
	y int
}

func main() {
	var a interface{}
	var point = Point{1, 2}
	a = point
	var b Point
	//b = a//这种情况不能将一个接口变量赋值给自定义类型变量，需要用到类型断言
	//类型断言,判断a是否指向Point变量，如果是就转成Point，并赋值给b
	b, ok := a.(Point)
	if ok == true {
		fmt.Println(b)
	}

	var x interface{}
	var c float64 = 1.0
	x = c //空接口可以接受任意类型
	/*
		y, ok := x.(float64)
		if ok == true {
			fmt.Printf("y=%T,y=%v", y,y)
		}
	*/
	if y, ok := x.(float64); ok == true {
		fmt.Printf("y=%T,y=%v", y, y)
	}

}
