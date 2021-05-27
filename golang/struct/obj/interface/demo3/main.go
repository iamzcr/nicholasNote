package main

import "fmt"

type Cinterface interface {
	SayC()
}
type Binterface interface {
	SayB()
}
type Ainterface interface {
	//继承多个接口
	Binterface
	Cinterface
	SayA()
}
type Stu struct {
	Name string
}

func (stu Stu) SayA() {
	fmt.Println("stu SayA say")
}
func (stu Stu) SayB() {
	fmt.Println("stu SayB say")
}
func (stu Stu) SayC() {
	fmt.Println("stu SayC say")
}

func main() {
	var stu Stu
	var a Ainterface = stu
	a.SayA()
	a.SayB()
	a.SayC()
}
