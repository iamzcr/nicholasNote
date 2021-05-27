package main

import (
	"fmt"
	"golangStudy/struct/obj/fengzhuang/person/model"
)

func main() {
	person := model.NewPerson("张三")
	person.SetAge(16)
	person.SetSal(5000)
	age := person.GetAge()
	sal := person.GetSal()
	fmt.Println(age)
	fmt.Println(sal)
}
