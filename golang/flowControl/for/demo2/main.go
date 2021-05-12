package main

import "fmt"

func main() {
	k := 1
	for {
		if k <= 10 {
			fmt.Printf("%d：hello world\n",k)
		} else {
			break//break跳出循环
		}
		k++
	}
}
