package main

import (
	"fmt"
	"golangStudy/struct/obj/factroy/model"
)

func main() {
	//返回的是指针
	stu := model.NewStudent("zcr", 12)
	fmt.Println(stu.Name)
	//因为stu已经是一个结构体对象，可以直接调用结构体方法
	fmt.Println(stu.GetAge())
	/*
		stu := model.Student{
			Name: "test",
			Age:  333,
		}
		fmt.Println(stu)
	*/
}
