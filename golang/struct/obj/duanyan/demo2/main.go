package main

import "fmt"

type Student struct {
	Name string
}

func checkType(items ...interface{}) {
	for i, v := range items {
		switch v.(type) {
		case int:
			fmt.Printf("第%d参数类型是%T,值是%v\n", i, v, v)
		case bool:
			fmt.Printf("第%d参数类型是%T,值是%v\n", i, v, v)
		case float64:
			fmt.Printf("第%d参数类型是%T,值是%v\n", i, v, v)
		case string:
			fmt.Printf("第%d参数类型是%T,值是%v\n", i, v, v)
		case Student:
			fmt.Printf("第%d参数类型是%T,值是%v\n", i, v, v)
		case *Student:
			fmt.Printf("第%d参数类型是%T,值是%v\n", i, v, v)
		}
	}
}
func main() {
	var n1 float64 = 1.1
	var str string = "4444"
	var i int = 555
	var stu Student

	checkType(n1, str, i, stu, &stu)
}
