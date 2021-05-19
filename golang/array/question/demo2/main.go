//数组反转
package main

import (
	"fmt"
	"math/rand"
	"time"
)

func main() {
	var arr [8]int
	rand.Seed(time.Now().UnixNano())
	for i := 0; i < len(arr); i++ {
		arr[i] = rand.Intn(100)
	}
	fmt.Printf("反转前：%v\n", arr)
	//交换次数=len(arr)/2,倒数第一个和第一个交换...
	temp := 0
	for i := 0; i < len(arr)/2; i++ {
		temp = arr[len(arr)-1-i]
		arr[len(arr)-1-i] = arr[i]
		arr[i] = temp
	}
	fmt.Printf("反转后：%v", arr)
}
