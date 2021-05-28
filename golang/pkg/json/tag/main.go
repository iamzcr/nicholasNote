package main

import (
	"encoding/json"
	"fmt"
)

type Hero struct {
	Name  string `json:"name"`
	Age   int    `json:"age"`
	Skill string `json:"skill"`
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

func main() {
	testStruct()
}
