package main

import "fmt"

func main() {
	i, count, sum := 1, 0, 0
	for ; i < 100; i++ {
		if i%9 == 0 {
			fmt.Printf("%d\n", i)
			count++
			sum += i
		}
	}
	fmt.Printf("1-100能整除9的个数=%d：总和=%d\n", count, sum)

}
