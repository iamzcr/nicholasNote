package main

import (
	"encoding/json"
	"fmt"
)

type Hero struct {
	Name  string
	Age   int
	Skill string
}

func testStruct() {
	hero := Hero{
		Name:  "大雄",
		Age:   111,
		Skill: "GOGOGOG",
	}
	//序列化,返回的byte切片，所以要转成字符串,传地址效率高
	data, err := json.Marshal(&hero)
	if err != nil {
		fmt.Println(err)
	}
	fmt.Printf("%v", string(data))
}
func testMap() {
	//定义map
	var mapTest map[string]interface{}
	//使用map，需要make
	mapTest = make(map[string]interface{})
	mapTest["name"] = "test"
	mapTest["age"] = 1111
	//序列化,返回的byte切片，所以要转成字符串
	data, err := json.Marshal(mapTest)
	if err != nil {
		fmt.Println(err)
	}
	fmt.Printf("%v", string(data))
}
func testSlice() {
	var slice []map[string]interface{}
	//定义map
	var mapTest map[string]interface{}

	//使用map，需要make
	mapTest = make(map[string]interface{})
	mapTest["name"] = "test"
	mapTest["age"] = 1111
	slice = append(slice,mapTest)

	//使用map，需要make
	mapTest = make(map[string]interface{})
	mapTest["name"] = "test2"
	mapTest["age"] = 2222
	slice = append(slice,mapTest)
	//序列化,返回的byte切片，所以要转成字符串
	data, err := json.Marshal(slice)
	if err != nil {
		fmt.Println(err)
	}
	fmt.Printf("%v", string(data))
}
func main() {
	testStruct()
	testMap()
	testSlice()
}
