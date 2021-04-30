package main

import "fmt"

func main() {
	var num1 int = 6
	var num2 float64 = 6.2623
	var b bool = true
	var char byte = 'i'
	var str string
	str = fmt.Sprintf("%d", num1)
	fmt.Printf("str = %v;str = %T\n", str, str)

	str = fmt.Sprintf("%f", num2)
	fmt.Printf("str = %v;str = %T\n", str, str)

	str = fmt.Sprintf("%t", b)
	fmt.Printf("str = %q;str = %T\n", str, str)

	str = fmt.Sprintf("%c", char)
	fmt.Printf("str = %q;str = %T\n", str, str)
}
