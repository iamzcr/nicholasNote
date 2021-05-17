package main

import (
	"fmt"
	"strconv"
	"strings"
)

func main() {

	//字符串长度
	var str string = "33333"
	var str2 string = "33333我的"
	fmt.Printf("str长度=%d\n", len(str))
	fmt.Printf("str2长度=%d\n", len(str2))

	//字符串转[]rune切片
	myslice := []rune(str2)
	for i := 0; i < len(myslice); i++ {
		fmt.Printf("%c\n", myslice[i])
	}
	//字符串转整数
	num, _ := strconv.Atoi(str)
	fmt.Printf("%d----%T\n", num, num)

	//整数转字符串
	mystr := strconv.Itoa(num)
	fmt.Printf("%v----%T\n", mystr, mystr)

	//字符串转[]byte类型切片
	bytes := []byte("hello go")
	fmt.Printf("%c----%T\n", bytes, bytes)

	//[]byte类型切片转字符串
	byte_str := string([]byte{'1', '1', '1'})
	fmt.Printf("%v----%T\n", byte_str, byte_str)

	//十进制->2,8,16进制
	test := strconv.FormatInt(123, 2)
	fmt.Printf("%v----%T\n", test, test)

	//统计字符串有多少指定的子串
	count := strings.Count("hello", "l")
	fmt.Printf("%v----%T\n", count, count)

	//查找子串是否在某个字符串里面
	flag := strings.Contains("hello", "l")
	fmt.Printf("%v----%T\n", flag, flag)

	//不区分大小写比较两个字符串,==是区分字母大小写
	flag = strings.EqualFold("ABc", "abc")
	fmt.Printf("%v----%T\n", flag, flag)

	//子串第一次在某个字符串出现的位置，没有返回-1
	index := strings.Index("ABac", "a")
	fmt.Printf("%v----%T\n", index, index)

	//子串最后一次在某个字符串出现的位置，没有返回-1
	lastIndex := strings.LastIndex("ABaAAac", "a")
	fmt.Printf("%v----%T\n", lastIndex, lastIndex)

	//字符串替换，最后一个参数表示你要替换多少个，-1表示全部替换
	myStr := strings.Replace("ABaAAac", "a", "b", 1)
	fmt.Printf("%v----%T\n", myStr, myStr)

	//字符串切割成数组
	myArr := strings.Split("ABaAAac;中国人", ";")
	for i := 0; i < len(myArr); i++ {
		fmt.Printf("%v===%T\n", myArr[i],myArr[i])
	}
	fmt.Printf("%v----%T\n", myArr, myArr)

	//大小写转换：ToLower转小写，ToUpper转大写
	fmt.Printf("%v----%T\n", strings.ToLower("ABaAAac"), strings.ToLower("ABaAAac"))
	fmt.Printf("%v----%T\n", strings.ToUpper("ABaAAac"), strings.ToUpper("ABaAAac"))
}
