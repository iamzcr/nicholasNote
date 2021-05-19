package main

import "fmt"

func fb(n int) []uint64 {
	fbSlice := make([]uint64, n)
	fbSlice[0] = 1
	fbSlice[1] = 1
	for i := 2; i < n; i++ {
		fbSlice[i] = fbSlice[i-1] + fbSlice[i-2]
	}
	return fbSlice
}
func main() {
	
	fbSlice := fb(50)
	fmt.Println(fbSlice)
}
