package main

import "fmt"

func main() {
	var mapTest = make(map[string]string)
	mapTest["str1"] = "test"
	//如果key还没有，就是增加
	mapTest["str2"] = "test1"
	//如果key存在就是更新
	mapTest["str1"] = "test2"
	fmt.Println(mapTest)
	//map删除，删除只能逐个遍历删除，没有一次性删除，或者重新分配空间
	delete(mapTest, "str1")
	fmt.Println(mapTest)
	mapTest = make(map[string]string)
	fmt.Println(mapTest)
	//map查找
	val, res := mapTest["str1"]
	if(res){
		fmt.Printf("val=%v",val)
	}else {
		fmt.Println("key不存在")
	}
}
