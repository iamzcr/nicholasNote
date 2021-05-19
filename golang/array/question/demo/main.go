//打印A-Z
package main

import "fmt"

func main() {
	var arr [26]byte
	for i := 0; i < len(arr); i++ {
		arr[i] = 'A' + byte(i)
	}
	for i := 0; i < len(arr); i++ {
		fmt.Printf("%d===%c\n", i, arr[i])
	}
}
