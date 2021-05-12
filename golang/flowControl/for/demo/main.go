package main

import "fmt"

func main() {
	var i int
	for i = 1; i <= 10; i++ {
		fmt.Printf("%v：\n", &i)
		fmt.Printf("%d：hello world\n", i)
	}
	fmt.Printf("%d：hello world\n", i)
	j:=1
	for ; j <= 10; j++ {
		fmt.Printf("%v：\n", &j)
		fmt.Printf("%d：hello world\n", j)
	}
	fmt.Printf("%d：hello world\n", j)
}
