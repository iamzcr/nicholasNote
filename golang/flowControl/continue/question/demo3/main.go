package main

import "fmt"

func main() {
	var money float64 = 100000
	var passCount int = 0
	for {
		fmt.Printf("剩余金钱=%v\n", money)
		if money > 50000 {
			money -= (money * 0.05)

			passCount++
			continue
		}
		if money < 50000 && money > 1000 {
			money -= 1000
			passCount++
			continue
		}
		if money < 1000 {
			break
		}
	}
	fmt.Println(passCount)
}
