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
	a A //组合结构体
	B   //匿名结构体
}

func main() {
	c := &C{}
	//c.Name = "B学生" 报错
	//a是一个有名的结构体，这种模式叫组合，如果是组合关系，那么访问组合的结构体的属性或者方法时，必须加上结构体的名字
	c.a.Name = "B学生"
	c.score = 30
}
