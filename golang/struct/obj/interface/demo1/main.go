package main

import "fmt"

type Ainterface interface {
	say()
}

type Stu struct {
	Name string
}

func (stu Stu) say() {
	fmt.Println("stu say")
}

type integer int

func (i integer) say() {
	fmt.Println("integer say",i)
}
func main() {
	//接口本身不能创建实例
	//var a Ainterface
	//a.say()
	//但是可以指向一个实现了该接口的自定义类型的变量(实例)/，重要
	var stu Stu
	var b Ainterface = stu
	b.say()
	//只要是自定义的数据类型，就可以实现接口，不仅仅是结构体
	var i integer = 10
	var c Ainterface = i
	c.say()
}
