package main

import "fmt"

type Circle struct {
	radius float64
}

func (c Circle) area() float64 {
	return 3.14 * c.radius * c.radius
}

//方法绑定结构体指针，提高传递效率，修改结构体外部的值
func (c *Circle) area2() float64 {
	//因为c是指针，标准的调用方式应该是(*c).radius * (*c).radius,也等价于下面的写法，因为编译器会自动添加*
	c.radius = 10
	fmt.Printf("area2===%p\n",c)
	return 3.14 * c.radius * c.radius
}
func main() {
	var c Circle
	c.radius = 4.0
	area := c.area()
	fmt.Printf("面积：%v\n", area)

	var c2 Circle
	fmt.Printf("c2===%p\n",&c2)

	c2.radius = 5.0
	fmt.Printf("radius：%v\n", c2.radius)
	//当我们方法和结构体指针类型绑定时，标准的调用方法的方式应该是(&c).area()，也等价于下面的写法，因为编译器会自动添加&
	area2 := c2.area2()
	fmt.Printf("面积：%v\n", area2)
	fmt.Printf("radius：%v\n", c2.radius)

}
