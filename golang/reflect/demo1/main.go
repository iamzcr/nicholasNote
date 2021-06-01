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
	//获取 reflect.Type
	rTypeVal := reflect.TypeOf(r)
	fmt.Println(rTypeVal)

	//获取 reflect.Value
	rVal := reflect.ValueOf(r)
	fmt.Printf("%v--------%T\n", rVal.Kind(),rVal.Kind())


	//reflect.Value转回interface{}
	iv := rVal.Interface()
	fmt.Printf("%v--------%T\n", iv, iv)

	//interface{}断言转回传进来的类型
	iv2, ok := iv.(Student)
	if !ok {
		fmt.Printf("error")
	}
	fmt.Printf("%v--------%T\n", iv2.Name, iv2)

}
func main() {
	//定义int类型
	stu := Student{
		Name: "zcr",
		Age:  11,
	}
	testReflect(stu)
}
