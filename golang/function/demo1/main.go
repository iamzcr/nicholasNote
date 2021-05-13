package main

import "fmt"

func main() {
	num := 20
	test(&num)
	fmt.Println(num)
}
func test(num *int) {
	//*num表示获取指向num存的地址所在的值
	*num = *num + 10
	fmt.Println(*num)
}
