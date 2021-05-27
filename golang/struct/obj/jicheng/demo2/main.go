package main

import "fmt"

//学生
type A struct {
	Name string
	age  int
}

func (a *A) Say() {
	fmt.Printf("A say %v\n", a.Name)
}
func (a *A) hello() {
	fmt.Printf("A hello %v\n", a.Name)
}
type B struct {
	A
	Name string
}
func (b *B) Say() {
	fmt.Printf("B say %v\n", b.Name)
}
func main() {

	b1 := &B{}
	b1.Name = "B学生"
	//如希望访问匿名结构体的方法和属性，可以通过匿名结构体名来区分
	b1.A.Name = "A学生"
	b1.age = 10
	b1.Say()
	//调用hello方法，会继承A的hello方法，如果A结构体的name没有赋值，所以A结构体的name是空
	b1.hello()
}
