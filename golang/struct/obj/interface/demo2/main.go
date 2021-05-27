package main

import "fmt"

type Ainterface interface {
	SayA()
}
type Binterface interface {
	SayB()
}

type Stu struct {
	Name string
}

func (stu Stu) SayB() {
	fmt.Println("stu SayB say")
}
func (stu Stu) SayA() {
	fmt.Println("stu SayA say")
}

func main() {
	var stu Stu
	var a Ainterface = stu
	var b Binterface = stu
	a.SayA()
	b.SayB()
}
