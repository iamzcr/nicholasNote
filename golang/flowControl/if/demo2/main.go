package main

import (
	"fmt"
	"math"
)

func main() {
	var a, b, c float64
	a, b, c = 3.0, 100, 6.0
	num := b*b - 4*a*c
	if num > 0 {
		x1, x2 := (-b+math.Sqrt(num))/2*a, (-b-math.Sqrt(num))/2*a
		fmt.Printf("x1=%v,x2=%v\n", x1, x2)
	} else if num == 0 {
		x1 := (-b + math.Sqrt(num)) / 2 * a
		fmt.Printf("x1=%vn", x1)
	} else {
		fmt.Printf("no answer")
	}
}
