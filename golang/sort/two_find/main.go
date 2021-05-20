//arr = [1,8,10,89,1000,1234]
//例如查询某个数findVal是否有存在arr上面
//首先定义首尾两个数的index为leftIndex和rightIndex
//先找到中间下标，middleIndex = (leftIndex+rightIndex)/2,然后用中间下标对应的值和findVal比较
//如果arr[middleIndex]>findVal,说明我们要找的数findVal在leftIndex和middleIndex之间，把middleIndex作为rightIndex，递归重复上面步骤
//如果arr[middleIndex]<findVal,说明我们要找的数findVal在middleIndex和rightIndex之间，把middleIndex作为leftIndex，递归重复上面步骤
//如果arr[middleIndex]=findVal,那么我们要找的数就是findVal
package main

import "fmt"

//递归
//输入8，第一次执行函数{1, 8, 10, 89, 1000, 1234},0,5,8
//输入8，第二次执行函数{1, 8, 10, 89, 1000, 1234},0,1,18
func twoFind(arr *[6]int, leftIndex int, rightIndex int, findVal int) int {
	fmt.Printf("数组是%v\n", arr)

	//当左边的大于右边的index时候，终止递归
	for leftIndex <= rightIndex {
		middleIndex := (leftIndex + rightIndex) / 2
		if (*arr)[middleIndex] == findVal {
			return middleIndex
		} else if (*arr)[middleIndex] > findVal {
			return twoFind(arr, leftIndex, middleIndex-1, findVal)
		} else {
			return twoFind(arr, middleIndex+1, rightIndex, findVal)
		}
	}
	return -1
}

//迭代
func binarySearch(arr *[6]int, leftIndex int, rightIndex int, findVal int) int {
	//当左边的大于右边的index时候，终止迭代
	for leftIndex <= rightIndex {
		middleIndex := rightIndex + leftIndex/2
		if (*arr)[middleIndex] == findVal {
			return middleIndex
		} else if (*arr)[middleIndex] > findVal {
			rightIndex = middleIndex - 1
		} else {
			leftIndex = middleIndex + 1
		}
	}
	return -1
}

func main() {
	findVal := 8
	arr := [6]int{1, 8, 10, 89, 1000, 1234}
	finnalVal := twoFind(&arr, 0, len(arr)-1, findVal)
	if finnalVal != -1 {
		fmt.Printf("找到的数是%v，下标为%v\n", arr[finnalVal], finnalVal)
	} else {
		fmt.Printf("找不到该数\n")
	}
	/*
		binaryVal := binarySearch(&arr, 0, len(arr)-1, findVal)
		if binaryVal != -1 {
			fmt.Printf("找到的数是%v，下标为%v", arr[binaryVal], binaryVal)
		} else {
			fmt.Printf("找不到该数")
		}
	*/
}
