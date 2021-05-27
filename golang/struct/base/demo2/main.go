package main

import "fmt"

type Point struct {
	x int
	y int
}
type Rect struct {
	leftUp, rightDown Point
}
type Rect2 struct {
	leftUp, rightDown *Point
}
func main() {
	r1 := Rect{Point{1, 2}, Point{3, 4}}
	//ri有4个int，在内存中是连续分布的,刚好相差8个字节，因为int值占用8个字节
	fmt.Printf("%p；%p；%p；%p\n",&r1.leftUp.x,&r1.leftUp.y,&r1.rightDown.x,&r1.rightDown.y)

	r2 := Rect2{&Point{1, 2}, &Point{3, 4}}
	//两个指针类型，这两个类型本身的地址也是连续的
	fmt.Printf("本身的地址：%p；%p；\n",&r2.leftUp,&r2.rightDown)
	//但是他们指向的地址不一定是连续的
	fmt.Printf("指向的地址：%p；%p；\n",r2.leftUp,r2.rightDown)
}
