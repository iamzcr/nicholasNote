###排序
####内部排序：将需要处理的所有数据都加载都内部存储器中进行排序(包括交换式排序法，选择式排序法，插入式排序法)
#########交换式排序：冒泡排序，快速排序
冒泡排序：
```
//冒泡排序
/**
arr = [24,69,80,57,13]
原来，让前面的数和后面的数进行比较，如果前面的数大，则交换
第一轮排序开始
第1次比较，24比69小，所以出来结果：[24,69,80,57,13]
第2次比较，69比80小，出来结果：[24,69,80,57,13]
第3次比较，80比57大，所以交换位置，出来结果：[24,69,57,80,13]
第4次比较，80比13大，所以交换位置，出来结果：[24,69,57,13,80]
第一轮排序结束
第二轮排序开始
第1次比较，24比69小，所以出来结果：[24,69,57,13,80]
第2次比较，69比57大，所以交换位置，出来结果：[24,57,69,13,80]
第3次比较，69比13大，所以交换位置，出来结果：[24,57,13,69,80]
第4次比较，因为第一轮排序就确定了80是最大的数，所以没必要比较
第二轮排序结束
第三轮排序开始
第1次比较，24比57小，所以出来结果：[24,57,13,69,80]
第2次比较，57比13大，所以交换位置，出来结果：[24,13,57,69,80]
第3次比较，因为第二轮排序就确定了69和80的排序，所以没必要比较
第三轮排序结束
第四轮排序开始
第1次比较，24比13小，所以出来结果：[13,24,57,69,80]
第2次比较，因为第三轮排序就确定了57，69和80的排序，所以没必要比较
第四轮排序结束
所以结果是[13,24,57,69,80]
规则分析：
1、经过了数组len(arr)-1排序，每一轮将会确定一个数的位置
2、每一次排序的比较次数逐渐减少[4,3,2,1]
3、当发现前面一个数比后面一个数大的时候，就进行交互
*/

package main

import "fmt"

func BubbingSort(arr *[5]int) {
	fmt.Printf("排序前：%v\n", *arr)
	for i := 0; i < len(*arr)-1; i++ {
		temp := 0
		for j := 0; j < len(*arr)-1-i; j++ {
			if (*arr)[j] > (*arr)[j+1] {//从小到大，<从大到小
				//交换
				temp = (*arr)[j]
				(*arr)[j] = (*arr)[j+1]
				(*arr)[j+1] = temp
			}
		}
		fmt.Printf("第%v轮排序后：%v\n", i, *arr)
	}
	/*
		temp := 0
		for j := 0; j < 4; j++ {
			if (*arr)[j] > (*arr)[j+1] {
				//交换
				temp = (*arr)[j]
				(*arr)[j] = (*arr)[j+1]
				(*arr)[j+1] = temp
			}
		}
		fmt.Printf("第一轮排序后：%v\n", *arr)

		for j := 0; j < 3; j++ {
			if (*arr)[j] > (*arr)[j+1] {
				//交换
				temp = (*arr)[j]
				(*arr)[j] = (*arr)[j+1]
				(*arr)[j+1] = temp
			}
		}
		fmt.Printf("第二轮排序后：%v\n", *arr)

		for j := 0; j < 2; j++ {
			if (*arr)[j] > (*arr)[j+1] {
				//交换
				temp = (*arr)[j]
				(*arr)[j] = (*arr)[j+1]
				(*arr)[j+1] = temp
			}
		}
		fmt.Printf("第三轮排序后：%v\n", *arr)
		for j := 0; j < 1; j++ {
			if (*arr)[j] > (*arr)[j+1] {
				//交换
				temp = (*arr)[j]
				(*arr)[j] = (*arr)[j+1]
				(*arr)[j+1] = temp
			}
		}
		fmt.Printf("第四轮排序后：%v\n", *arr)
	*/
}
func main() {
	arr := [5]int{24, 69, 80, 57, 13}
	BubbingSort(&arr)
	fmt.Printf("排序后：%v\n", arr)
}

```
顺序查找
```
	arr := []string{"test1", "test2", "test3", "test4", "test5"}
	var searchStr = ""
	fmt.Println("请输入要查找的字符串...")
	fmt.Scanln(&searchStr)
	//方式一
	for i := 0; i < len(arr); i++ {
		if searchStr == arr[i] {
			fmt.Printf("找到字符串为%v,下标为%v\n", searchStr, i)
			break
		} else if i == len(arr)-1 {
			fmt.Printf("找不到字符串%v\n", searchStr)
		}
	}
	//方式二
	index := -1
	for i := 0; i < len(arr); i++ {
		if searchStr == arr[i] {
			index = 1
			break
		}
	}
	if index != -1 {
		fmt.Printf("找到字符串为%v,下标为%v\n", searchStr, index)
	} else {
		fmt.Printf("找不到字符串%v\n", searchStr)
	}

```
二份查找：对一个有序数组进行二份查找，输入一个数，查找是否存在于有序数组中，递归，迭代
```
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
//输入10，第一次执行函数{1, 8, 10, 89, 1000, 1234}
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
	findVal := 10
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

```

外部排序：数据量过大，没法全部加载都内部存储器中，需要借助外部存储进行排序(合并排序法、直接合并排序法)