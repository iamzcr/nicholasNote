package main

import "fmt"

func main() {
	i, j := 0, 6
	for i <= 6 {
		fmt.Printf("%d + %d = %d\n", i, j, i+j)
		i++
		j--
	}
}
