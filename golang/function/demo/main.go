package main

import "fmt"

func main() {
	//test(4)
	test2(4)

}

//当执行main函数的时候，开辟一个栈空间，执行test函数，此时4>2条件成立，此时该栈区的值是3，但是因为有else存在，所以fmt.Println(num1)不执行
//开辟新栈区，调用自身，此时3>2条件成立，此时该栈区的值是2，但是因为有else存在，所以fmt.Println(num1)不执行
//开辟新栈区，继续调用自身，2>2条件不成立,执行else后面的语句，此时该栈区的值是2， 所以执行fmt.Println(num1)为2
//当不再开辟栈空间了，函数会按照返回之后才能执行剩下的语句，所以最后的结果是2
func test2(num1 int) {
	if num1 > 2 {
		num1--
		test2(num1)
	} else {
		fmt.Println(num1)
	}
}

//当执行main函数的时候，开辟一个栈空间，执行test函数，此时4>2条件成立，此时该栈区的值也就是fmt.Println(num1)为4--=3
//开辟新栈区，调用自身，此时3>2条件成立，此时该栈区的值也就是fmt.Println(num1)为3--=2
//开辟新栈区，继续调用自身，2>2条件不成立,此时不在调用自身函数 此时该栈区的值也就是fmt.Println(num1)为2
//当不再开辟栈空间了，函数会按照返回之后才能执行剩下的语句，所以最后的结果是2,2,3
func test(num1 int) {
	if num1 > 2 {
		num1--
		test(num1)
	}
	fmt.Println(num1)
}
