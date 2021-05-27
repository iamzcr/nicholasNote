package main

import "fmt"

type Stu struct {
	Name string
	Age  int
}

func (stu *Stu) String() string {
	str := fmt.Sprintf("name=[%v] age=[%v]", stu.Name, stu.Age)
	return str
}
func main() {
	stu := Stu{
		Name: "zcr",
		Age:  12,
	}
	fmt.Println(&stu)
}
