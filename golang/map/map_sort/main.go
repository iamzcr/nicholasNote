package main

import (
	"fmt"
	"sort"
)

func main() {
	mapTest := make(map[int]int, 5)
	mapTest[1] = 1000
	mapTest[3] = 4
	mapTest[4] = 3
	mapTest[2] = 2
	var keys []int
	for k, _ := range mapTest {
		keys = append(keys, k)
	}
	sort.Ints(keys)
	fmt.Println(keys)
	for _, val := range keys {
		fmt.Printf("k=%v,v=%v\n", val, mapTest[val])
	}
}
