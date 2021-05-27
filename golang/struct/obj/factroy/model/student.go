package model

/*
type Student struct {
	Name string
	Age  int
}
*/
//当Student变成小写student的时候，没法向外调用（其他包没法调用），使用工厂模式来实现跨包创建结构体实例
type student struct {
	Name string
	age  int
}

//提供一个函数对外获取到student对象
func NewStudent(name string, age int) *student {
	return &student{
		Name: name,
		age:  age,
	}
}
//如果age属性首字母小写，在其他包不能直接获取，提供一个对完的方法去获取
func (s *student) GetAge() int {
	return s.age
}
