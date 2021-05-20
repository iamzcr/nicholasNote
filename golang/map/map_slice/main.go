//遍历
package main

import "fmt"

func main() {
	slice := []map[string]string{}
	mapTest := map[string]string{
		"name": "test",
		"age": "1",
	}
	slice = append(slice, mapTest)
	mapTest = map[string]string{
		"name": "test1",
		"age": "22",
	}
	slice = append(slice, mapTest)
	fmt.Println(slice)


	var mySlice []map[string]string
	mySlice = make([]map[string]string, 2)
	if mySlice[0] == nil {
		mySlice[0] = make(map[string]string, 2)
		mySlice[0]["name"] = "test"
		mySlice[0]["age"] = "1"
	}
	if mySlice[1] == nil {
		mySlice[1] = make(map[string]string, 2)
		mySlice[1]["name"] = "tes1"
		mySlice[1]["age"] = "22"
	}

	mapAppend := map[string]string{
		"name": "test2",
		"age": "23",
	}
	mySlice = append(mySlice, mapAppend)
	fmt.Println(mySlice)

}
