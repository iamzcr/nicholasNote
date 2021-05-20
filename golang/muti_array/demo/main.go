package main

import "fmt"

func main() {

	var arr [4][6]int
	arr[2][2] = 1
	for i := 0; i < 4; i++ {
		for j := 0; j < 6; j++ {
			fmt.Print(arr[i][j], " ")
		}
		fmt.Println()
	}
	//直接初始化
	//var arr1 = [2][2]int{{1, 1},{1, 1}}
}
