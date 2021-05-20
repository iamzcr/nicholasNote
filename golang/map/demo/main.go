package main

import "fmt"

func main() {
	var mapTest = make(map[string]string)
	mapTest["str1"] = "test"
	fmt.Println(mapTest)
	fmt.Println(mapTest["str1"])
	fmt.Printf("%v", mapTest)

	//第一种
	var mapTest1 map[string]string
	mapTest1 = make(map[string]string, 10)
	fmt.Println(mapTest1)
	//第二种
	mapTest2 := make(map[string]string, 10)
	fmt.Println(mapTest2)
	//第三种
	mapTest3 := map[string]string{
		"test": "test",
	}
	fmt.Println(mapTest3)

	stuMap := make(map[string]map[string]string)
	stuMap["01"] = make(map[string]string)
	stuMap["01"]["name"] = "ceshi"
	stuMap["01"]["sex"] = "男"

	stuMap["02"] = make(map[string]string)
	stuMap["02"]["name"] = "ceshi1"
	stuMap["02"]["sex"] = "男1"
	fmt.Println(stuMap)
}
