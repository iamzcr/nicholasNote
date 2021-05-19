//求一个数组的最大值
package main

import "fmt"

func main() {
	var arr = [...]int{1, 5, 8, 6, 66,
		9}
	maxVal := arr[0]
	maxValIndex := 0
	for i := 1; i < len(arr); i++ {
		if maxVal < arr[i] {
			maxVal = arr[i]
			maxValIndex = i
		}
	}
	fmt.Printf("arr数组最大值下标为：%d；值为%d", maxValIndex, maxVal)
}
