package main

import "fmt"

func main() {
	//初始化数组
	var arr1 [3]int = [3]int{1, 2, 3}
	var arr2 = [3]int{1, 2, 3}
	var arr3 = [...]int{1, 2, 3}
	//虽然是自定义顺序下标，但是输出的时候还是会按照下标从小到大输出
	var arr4 = [...]string{1: "test", 2: "test1", 0: "test3"}
	arr5 := [...]int{2: 600, 3: 700, 1: 800}
	var arr6  [3]*int
	fmt.Printf("arr1：%v\n", arr1)
	fmt.Printf("arr2：%v\n", arr2)
	fmt.Printf("arr3：%v\n", arr3)
	fmt.Printf("arr4：%v\n", arr4)
	fmt.Printf("arr5：%v\n", arr5)
	fmt.Printf("arr6：%v\n", arr6)

	var arr [3]float64
	arr[0] = 12
	arr[1] = 10
	arr[2] = 16
	total := 0.0
	for i := 0; i < len(arr); i++ {
		total += arr[i]
	}
	avg := fmt.Sprintf("%.2f", total/float64(len(arr)))
	fmt.Printf("总数是:%v，平均值是:%v\n", total, avg)
}
