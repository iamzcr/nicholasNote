package main

import "fmt"



func main() {
	type stuInfo struct {
		Name string
		Age  int
		Add  string
	}
	stuMap := make(map[string]stuInfo)
	stu1 := stuInfo{
		Name: "test",
		Age:  2,
		Add:  "2222",
	}
	stu2 := stuInfo{
		Name: "test1",
		Age:  21,
		Add:  "1111",
	}
	stuMap["01"] = stu1
	stuMap["02"] = stu2
	for index, stu := range stuMap {
		fmt.Printf("学号==%v；名字==%v；年龄==%v;地址==%v\n", index, stu.Name, stu.Age,stu.Add)
	}
	fmt.Println(stuMap)
}
