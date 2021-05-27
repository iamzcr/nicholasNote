package main

type A struct {
	Name string
	age  int
}
type B struct {
	Name  string
	score int
}
type C struct {
	A
	B
}

func main() {
	c := &C{}
	//A,B有同名属性Name，但是C没有，那么结构体变量必须指定匿名结构体，否者报错
	//c.Name = "B学生" 编译报错
	c.B.Name = "B学生"
}
