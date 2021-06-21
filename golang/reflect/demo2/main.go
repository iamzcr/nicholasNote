package main

import (
	"fmt"
	"reflect"
)

type Student struct {
	Name string
	Age  int
}

func testReflect(r interface{}) {
	//获取 reflect.Value
	rVal := reflect.ValueOf(r)
	fmt.Printf("%v--------%T\n", rVal.Kind(), rVal.Kind())
	//rVal.SetInt(144)//不能直接这样修改，需要通过Elem()获取到指针指向的值，如下：
	rVal.Elem().SetInt(144)
}
func main() {
	num := 10
	testReflect(&num)
	fmt.Println(num)
}
