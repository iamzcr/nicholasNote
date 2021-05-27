package main

import "fmt"

type Test interface {
}
type Stu struct {
	Name string
}

func main() {
	var stu Stu

	var t Test = stu
	fmt.Println(t)
	var t2 interface{} = stu
	fmt.Println(t2)
	var num = 888
	t2 = num
	fmt.Println(t2)
}
