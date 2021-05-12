package main

import "fmt"

func main() {
	var v interface{}
	var num1 = 40
	v = num1
	switch i := v.(type) {
	case int:
		fmt.Printf("success int V类型%T", i)
	case float64:
		fmt.Printf("success float64 V类型%T", i)
	default:
		fmt.Println("fail")
	}
}
