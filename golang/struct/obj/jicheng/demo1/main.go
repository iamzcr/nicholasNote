package main

import "fmt"

//学生
type A struct {
	Name string
	age  int
}

func (a *A) Say() {
	fmt.Printf("say %v\n", a.Name)
}
func (a *A) hello() {
	fmt.Printf("hello %v\n", a.Name)
}
type B struct {
	A
}
func main() {
	b := &B{}
	b.A.Name = "小学生"
	b.A.Say()
	b.A.hello()

	//匿名结构体属性或者方法另外访问方式
	b1 := &B{}
	//如果B结构体中也有Name属性，会直接调用B结构体Name属性，没有就直接调用A的Name属性
	b1.Name = "小学生"
	b1.Say()
	b1.hello()
}
