package main

import "fmt"

type Person struct {
	Name string
}

func (p Person) speck() {
	fmt.Printf("%v是个好人\n", p.Name)
}
func (p Person) jisuan() {
	sum := 0
	for i := 1; i <= 1000; i++ {
		sum += i
	}
	fmt.Printf("1+...+1000结果是%d\n", sum)
}
func (p Person) jisuan2(n int) {
	sum := 0
	for i := 1; i <= n; i++ {
		sum += i
	}
	fmt.Printf("1+...+%d结果是%d\n", n, sum)
}

func (p Person) getSum(a, b int) (sum int) {
	sum = a + b
	return
}
func main() {
	var p Person
	p.Name = "zcr"
	p.speck()
	p.jisuan()
	p.jisuan2(4)
	sum := p.getSum(4, 1)
	fmt.Printf("sum=%d\n", sum)
}
