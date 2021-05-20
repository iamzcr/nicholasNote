//遍历
package main

import "fmt"

func main() {
	var mapTest = make(map[string]string)
	mapTest["str1"] = "test"
	mapTest["str2"] = "test1"
	for index, value := range mapTest {
		fmt.Printf("%v==%v\n", index, value)
	}

	stuMap := make(map[string]map[string]string)
	stuMap["01"] = make(map[string]string)
	stuMap["01"]["name"] = "ceshi"
	stuMap["01"]["sex"] = "男"

	stuMap["02"] = make(map[string]string)
	stuMap["02"]["name"] = "ceshi1"
	stuMap["02"]["sex"] = "男1"
	for index, value := range stuMap {
		fmt.Printf("学号==%v；名字==%v；性别==%v\n", index, value["name"], value["sex"])
	}
}
