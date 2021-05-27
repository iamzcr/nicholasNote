package main

import "fmt"

type Test struct {
}

func (t *Test) print() {
	for i := 0; i <= 10; i++ {
		for j := 0; j <= 8; j++ {
			fmt.Print("*")
		}
		fmt.Print("\n")
	}
}
func (t *Test) print2(n, m int) {
	for i := 0; i <= n; i++ {
		for j := 0; j <= m; j++ {
			fmt.Print("*")
		}
		fmt.Print("\n")
	}
}
func (t *Test) area(n, m float64) float64 {
	return n * m
}

func (t *Test) test(n int) {
	if n%2 == 0 {
		fmt.Print("偶数\n")
	} else {
		fmt.Print("基数" +
			"\n")
	}
}
func main() {
	var t Test
	t.print()
	fmt.Print("\n")
	t.print2(2, 6)
	res := t.area(2, 6)
	fmt.Print("\n", res)
}
