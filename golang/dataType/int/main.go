package main
//整型的使用
import (
	"fmt"
	"unsafe"
)

func main() {
	var i int = 1
	fmt.Println("i=", i)

	//var j int8 = -129
	//var j int8 = -128
	//var j int8 = 128
	var j int8 = 127
	fmt.Println("j=", j)

	//var k uint8 = 256
	//var k uint8 = -1
	var k uint8 = 0
	fmt.Println("k=", k)

	var a int = 8900
	fmt.Println("a=", a)

	var b uint = 2
	fmt.Println("b=", b)

	var c byte = 25
	fmt.Println("c=", c)

	var n1 = 100
	fmt.Printf("%T", n1)

	var n2 int64 = 100
	fmt.Printf("n2数据类型是：%T，n2占用的字节数是：%d\n", n2,unsafe.Sizeof(n2))
	fmt.Printf("n1数据类型是：%T，n1占用的字节数是：%d\n", n1,unsafe.Sizeof(n1))

	var age uint8 = 100
	var age1 byte = 100
	fmt.Printf("age数据类型是：%T，age占用的字节数是：%d\n", age,unsafe.Sizeof(age))
	fmt.Printf("age1数据类型是：%T，age1占用的字节数是：%d\n", age1,unsafe.Sizeof(age1))
}
