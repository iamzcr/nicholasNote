package main

import "fmt"

type Person struct {
	Name string
}
//这里的p表示哪个person变量调用，这个p就是他的副本，值拷贝，所以方法里面修改属性的值，外部属性不影响
func (p Person) test() {
	p.Name = "test"
	fmt.Printf("test===name==%v\n", p.Name)
}
func main() {
	var p Person
	p.Name = "mytest"
	p.test()
	fmt.Printf("test===name==%v", p.Name)
}
