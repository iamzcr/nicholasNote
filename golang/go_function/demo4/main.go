//闭包
package main

import "fmt"

func AddUpper() func(int) int {
	var n int = 10
	return func(x int) int {
		n = n + x
		return n
	}
}

func main() {
	//我们调用了AddUpper()并把它的返回值赋值给了fn这个变量， 从此以后，我们再也没有调用过AddUpper()函数，
	//因此自始至终AddUpper()函数本身只执行过一次，那么AddUpper()函数内部的n变量自始至终也只初始化过一次，
	//同时因为AddUpper()的返回值是一个函数，所以我们用fn接收了AddUpper()的返回值之后，
	//每次调用fn()函数调用的并不是AddUpper()，而是AddUpper()返回的匿名函数。
	fn := AddUpper()
	fmt.Println(fn(1))
}
