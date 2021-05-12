package main

import "fmt"

func main() {
	var num1 int32 = 40
	var num2 int32 = 20
	var num3 int32 = 70
	var num4 int64 = 70
	switch num1 {
	case num2,10,70://case后面的表达式可以有多个
		fmt.Println("success")
	case num3://case后面的表达式如果是常量值，编译不会报错
		fmt.Println("fail")
	case 70://case后面的表达式如果是常量值，编译会报错
		fmt.Println("fail const")
	case num4://case后的各个表达式的值的数据类型要和switch表达式数据类型一致
		fmt.Println("fail const")
	default://default语句不是必须的
		fmt.Println("error")
	}
}

