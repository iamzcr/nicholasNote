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
	var hero Hero
	str := "{\"Name\":\"大雄\",\"Age\":111,\"Skill\":\"GOGOGOG\"}"
	strByte := []byte(str)
	err := json.Unmarshal(strByte, &hero)
	if err != nil {
		fmt.Println(err)
	}
	fmt.Println(hero)
}
func tesMap() {
	str := "{\"age\":1111,\"name\":\"test\"}"
	var mapTest map[string]interface{}
	strByte := []byte(str)
	//在反序列化map时候，不需要make，make操作被封装到Unmarshal里面
	err := json.Unmarshal(strByte, &mapTest)
	if err != nil {
		fmt.Println(err)
	}
	fmt.Printf("%v\n", mapTest)
}
func tesSlice() {
	str := "[{\"age\":1111,\"name\":\"test\"},{\"age\":2222,\"name\":\"test2\"}]"
	var slice []map[string]interface{}
	strByte := []byte(str)
	//在反序列化slice时候，不需要make，make操作被封装到Unmarshal里面
	err := json.Unmarshal(strByte, &slice)
	if err != nil {
		fmt.Println(err)
	}
	fmt.Printf("%v", slice)
}

func main() {
	testStruct()
	tesMap()
	tesSlice()
}
