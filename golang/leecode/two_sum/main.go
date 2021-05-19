package main

import "fmt"

func twoSum(nums []int, target int) []int {
	var sumSlice = make([]int, 2)
	for i := 0; i < len(nums); i++ {
		for j := i + 1; j < len(nums); j++ {
			if nums[i]+ nums[j] ==target {
				return []int{i,j}
			}
		}
	}
	return sumSlice
}
func main() {
	slice := []int{-2, -4, -6}
	targert := -8
	fmt.Println(twoSum(slice, targert))
}
