###数组
######初始化数组
```
var arr1 [3]int //该方式初始化为0
var arr1 [3]int = [3]int{1, 2, 3}
var arr2 = [3]int{1, 2, 3}
var arr3 = [...]int{1, 2, 3}
//虽然是自定义顺序下标，但是输出的时候还是会按照下标从小到大输出
var arr4 = [...]string{1: "test", 2: "test1", 0: "test3"}
arr5 := [...]int{2: 600, 3: 700, 1: 800}
fmt.Printf("arr1：%v\n", arr1)
fmt.Printf("arr2：%v\n", arr2)
fmt.Printf("arr3：%v\n", arr3)
fmt.Printf("arr4：%v\n", arr4)
fmt.Printf("arr5：%v\n", arr5)
```
######数组是一个数据类型，属于值类型，下标从0开始
```
        var arr [3]float64
	arr[0]= 12
	arr[1]= 10
	arr[2]= 16
	total:=0.0
	for i:=0;i<len(arr);i++ {
		total+=arr[i]
	}
	avg:= fmt.Sprintf("%.2f",total/float64(len(arr)))
	fmt.Printf("总数是:%v，平均值是:%v\n",total,avg)  
```
######数组可以存放任意数据类型，但是必须是同一个类型数据,但是而且长度是固定的，不能动态变化
######声明完数组后，数组的各个元素已经有默认值，默认值是0，字符串默认值是"",bool默认为false，指针为nil
######对于不自定义下标的数组，数组的地址和数组首个元素的地址是一样的
```
        var arr [3]int
	fmt.Printf("数组的地址是：%v", arr)
	fmt.Printf("数组的地址是：%p", &arr)
	fmt.Printf("数组首个元素的地址是：%v", &arr[0])
```
######对于不自定义下标的数组，数组本身元素的地址是上一个元素地址加上本身元素占用的字节数
```
	var arr [3]int
	fmt.Printf("数组首个元素的地址是：%v\n", &arr[0])
	//数组本身元素的地址是上一个元素地址加上本身元素占用的字节数,例如int占8个字节，如果&arr[0]的地址是0xc00000e360，那么&arr[1]就是0xc00000e368
	fmt.Printf("数组第二个元素的地址是：%v\n", &arr[1])
```
######数组遍历
```
        var arr = [...]string{1: "test", 2: "test1", 0: "test3"}
	//按下标顺序遍历
	for index,value := range arr{
		fmt.Printf("index=%v,value=%v\n",index,value)
	}
```
######var s []int是切片，不是数组
######数组越界
```
var arr [2]int
	var index int = 3
	arr[index] = 6//编译器不报错，但是运行会越界
```
######数组的值传递和引用传递
```
func main() {
	var arr = [3]int{0, 1, 3}
	fmt.Printf("%v\n", arr)
	//数组值传递
	test(arr)
	fmt.Printf("%v\n", arr)

	var arr1 = [3]int{5, 6, 7}
	fmt.Printf("%v\n", arr1)
	//数组引用传递
	test1(&arr1)
	fmt.Printf("%v\n", arr1)
}
func test(arr [3]int) {
	arr[0] = 88
}
func test1(arr1 *[3]int) {
	(*arr1)[0] = 99
}

```

######数组在传递的过程中，长度也是类型的一部分


