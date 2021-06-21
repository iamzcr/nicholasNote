package main

import (
	"fmt"
	"reflect"
)

type Monster struct {
	Name  string `json:"name"`
	Age   int    `json:"monster_age"`
	Score float64
	Sex   string
}

func (s Monster) Print() {
	fmt.Println("---start--")
	fmt.Println(s)
	fmt.Println("---end--")
}
func (s Monster) GetSum(n1, n2 int) int {
	return n1 + n2
}
func (s Monster) Set(name string, age int, score float64, sex string) {
	s.Name = name
	s.Age = age
	s.Score = score
	s.Sex = sex
}
func testStruct(i interface{}) {
	typ := reflect.TypeOf(i)
	val := reflect.ValueOf(i)
	kd := val.Kind()
	if kd != reflect.Struct {
		fmt.Println("error struct")
		return
	}
	//获取结构体的属性数量
	num := val.NumField()
	fmt.Printf("has %v个属性\n", num)
	for i := 0; i < num; i++ {
		//val.Field(i)是一个value类型，不能操作运算
		fmt.Printf("属性=%d,值为=%v\n", i, val.Field(i))
		//获取结构体的标签，通过 reflect.Type来获取tag的标签的值
		tagVal := typ.Field(i).Tag.Get("json")
		//判断结构体字段是否有标签
		if tagVal != "" {
			fmt.Printf("属性=%d,tag为=%v\n", i, tagVal)
		}
	}

	//获取结构体的方法数量
	numMethod := val.NumMethod()
	fmt.Printf("has %v个方法\n", numMethod)
	//表示获取了结构体的第二个方法，结构体方法排序的时候，是按照字母来排序的
	val.Method(1).Call(nil)

	//调用第一个方法,需要传reflect.Value类型的切片
	var params []reflect.Value
	params = append(params, reflect.ValueOf(10))
	params = append(params, reflect.ValueOf(20))
	res := val.Method(0).Call(params) //返回的还是一个reflect.Value切片
	fmt.Printf("res=%v\n", res[0].Int())

}
func main() {
	var m Monster = Monster{
		Name:  "zcr",
		Age:   11,
		Score: 100,
		Sex:   "男",
	}
	testStruct(m)
}
