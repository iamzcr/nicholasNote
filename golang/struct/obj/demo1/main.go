package main

import "fmt"

type Student struct {
	Name string
	Age  int
}

func main() {
	//创建结构体变量时候指定属性的值
	stu := Student{"test", 10}
	fmt.Println(stu)

	var stu1 = Student{"test", 22}
	fmt.Println(stu1)

	//创建结构体变量时候指定属性名和属性值写在一起
	stu2 := Student{
		Name: "ZCR",
		Age:  20,
	}
	fmt.Println(stu2)

	var stu3 = Student{
		Name: "ZCR1",
		Age:  200,
	}
	fmt.Println(stu3)

	//创建返回一个结构体指针类型
	var stu5 = &Student{
		Name: "ZCR1",
		Age:  200,
	}
	//两种获取属性的方式都可以，底层会处理
	fmt.Println((*stu5).Name)
	fmt.Println(stu5.Name)
	stu6 := &Student{
		Name: "ZCR1",
		Age:  200,
	}
	//两种获取属性的方式都可以，底层会处理
	fmt.Println((*stu6).Name)
	fmt.Println(stu6.Name)

	stu7 := &Student{"test", 10}
	fmt.Println(*stu7)

	var stu8 = &Student{"test", 22}
	fmt.Println(*stu8)
}
