package main

import "fmt"

type Cal struct {
	Num1 float64
	Num2 float64
}

func (c *Cal) cut(opt byte) float64 {
	res := 0.0
	switch opt {
	case '+':
		res = c.Num1 + c.Num2
	case '-':
		res = c.Num1 - c.Num2
	case '*':
		res = c.Num1 * c.Num2
	case '/':
		res = c.Num1 / c.Num2
	}
	return res
}
func main() {
	c := Cal{
		Num1: 2.0,
		Num2: 1.5,
	}
	res := c.cut('+')
	fmt.Printf("%v", res)
	res = c.cut('-')
	fmt.Printf("%v", res)


}
