package main

import (
	"fmt"
	"reflect"
)

func testReflect(r interface{}) {
	//获取 reflect.Type
	rTypeVal := reflect.TypeOf(r)
	fmt.Println(rTypeVal)
	//获取 reflect.Value
	rVal := reflect.ValueOf(r)
	num := rVal.Int()
	fmt.Println(rVal)
	fmt.Printf("%T\n", rVal)
	fmt.Printf("%T\n", num)
	//reflect.Value转回interface{}
	sNum := rVal.Interface()
	//interface{}断言转回传进来的类型
	gNum := sNum.(int)
	fmt.Printf("%T\n", gNum)
}
func main() {
	//定义int类型
	var num int = 100
	testReflect(num)
	fmt.Printf("%T\n", num)
}
