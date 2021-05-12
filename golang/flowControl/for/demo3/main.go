package main

import (
	"fmt"
)

func main() {
	var str string = "test 中国"
	strRune := []rune(str)//把str拆分多个字符，转成一个存放类型为rune的切片
	for i := 0; i < len(strRune); i++ {
		fmt.Printf("%d：%c\n", i, str[i])
	}
	for index ,val := range str{
		fmt.Printf("%d：%c\n", index, val)
	}
}
