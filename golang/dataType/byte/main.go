package main

import "fmt"

func main() {
	var test byte
	fmt.Printf("test=%c,test=%d\n", test, test)
	//直接输出byte值，就是输出了对应的字符的码值
	var a byte = 'n'
	fmt.Println("a=", a)
	//如果我们希望输出对应的字符，需要使用格式化输出%c
	var b byte = '0'
	fmt.Printf("b=%c,b=%d\n", b, b)
	//当我们定义一个中文字符的时候，因为byte的长度是0-255，长度不够，我们通常用int来声明，所以字符的本质其实就是一个整数
	//例如我其实对应的码值就是25105
	var c int = '我'
	fmt.Printf("c=%c,c=%d,c=%v\n", c, c, c)

	var d byte = '0'
	var e byte = '1'
	f := d + e
	fmt.Printf("f=%c,f=%d", f, f)

}
