//创建结构体
package main

import "fmt"

type Person struct {
	Name string
	Age  int
}

func main() {
	//方式1
	person1 := Person{}
	person1.Name = "person1"
	fmt.Println(person1)
	//方式2
	person2 := Person{
		Name: "person2",
	}
	fmt.Println(person2)
	//方式3
	var person3 *Person = new(Person)
	//标准赋值方法
	(*person3).Name = "person3"
	//上面写法也等价于person3.Name = "person3"，是因为go底层做了(*person3)取值运算
	fmt.Println(*person3)
	//方式4
	var person4 *Person = &Person{}
	//标准赋值方法
	(*person4).Name = "person4"
	//上面写法也等价于person4.Name = "person4"，是因为go底层做了(*person3)取值运算
	fmt.Println(*person4)
	//方式5
	person5 := new(Person)
	person5.Name = "person5"
	fmt.Println(*person5)
	//方式6
	person6 := &Person{
		Age:  666,
	}
	person6.Name = "person6"
	fmt.Println(*person6)
	fmt.Println((*person6).Name)
	fmt.Println(person6.Name)
}
