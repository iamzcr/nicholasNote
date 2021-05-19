###slice
######切片是数组的一个引用，所以切片是引用类型，在传递的时候，遵守引用传递的机制
######切片的使用和数组类似，遍历，访问元素，求长度都一样
######切片长度可以变化，因此切片是一个可以动态变化的数组
####简单使用
```
    //定义一个数组
	arr := [...]int{1, 323, 3, 6, 7}
	fmt.Printf("arr %v\n", arr)
	//定义一个切片，arr[1:3]表示引用arr这个数组
	//引用arr数组起始下标是1，最后下标为3(不包含3)
	slice := arr[1:3]
	fmt.Printf("arr[1]的地址 %p\n", &arr[1])
	fmt.Printf("arr[2]的地址 %p\n", &arr[2])
	fmt.Printf("slice[0]元素是： %v,slice[0]地址是： %p\n", slice[0], &slice[0])
	fmt.Printf("slice[1]元素是： %v,slice[1]地址是： %p\n", slice[1], &slice[1])
	fmt.Printf("slice本身的地址 %p\n", &slice)
	//因为slice是对arr的一个引用，所以修改slice会影响到arr
	slice[1] = 666
	fmt.Printf("arr %v\n", arr)
	fmt.Printf("slice的元素=%v\n", slice)
	fmt.Printf("slice的元素个数=%v\n", len(slice))
	//容量：切面目前可以存放最多元素的个数，容量可以动态变化,一般是长度的两倍
	fmt.Printf("slice的容量=%v\n", cap(slice))
```
####定义切片方式
用切片去引用一个已经创建好的数组,数组是事先存在的，程序可见的
```
    myarr := [...]int{1, 323, 3, 6, 7}
    myslice := myarr[1:3]
	arr := [5]string{"str1", "str2", "str3", "str4", "str5"}
	//第0个开始，到第4个结束，不包括第4个元素
	arrSlice := arr[:4]
	//第1个开始，到数组最大长度结束
	arrSlice1 := arr[1:]
	//第0个开始，到数组最大长度结束
	arrSlice2 := arr[:]
	fmt.Printf("arrSlice=%v\n",arrSlice)
	fmt.Printf("arrSlice1=%v\n",arrSlice1)
	fmt.Printf("arrSlice2=%v\n",arrSlice2)
```
使用make创建，也会创建一个数组，由切片底层在维护，程序是不可见的
```
    初始化一个长度为4，容量为8的切片，容量可省略不写
    var makeSlice []int = make([]int, 4, 8)
```
直接引用指向指定具体的数组
```
	var arrSlice []int = []int{1,2,6}
	fmt.Printf("arrSlice %v\n", arrSlice)
```
切片的遍历
```
    arr := [5]string{"str1", "str2", "str3", "str4", "str5"}
    arrSlice := arr[1:4]
    for i := 0; i < len(arrSlice); i++ {
        fmt.Printf("切片arrSlice的第%d个元素是%v\n", i, arrSlice[i])
    }
    for index, value := range arrSlice {
        fmt.Printf("切片arrSlice的第%d个元素是%v\n", index, value)
    }
```
切片可以继续切片
```
    arr := [5]string{"str1", "str2", "str3", "str4", "str5"}
    arrSlice := arr[:4]
    arrSlice3 := arrSlice[1:3]
```
append的使用
```
    slice := []string{"str1", "str2", "str3"}
    fmt.Printf("slice=%v;slice地址=%p\n", slice, &slice)
    //append追加元素
    slice = append(slice, "str4")
    fmt.Printf("slice=%v;slice地址=%p\n", slice, &slice)
    //append追加多个元素
    slice = append(slice, "str5", "str6")
    fmt.Printf("slice=%v;slice地址=%p\n", slice, &slice)
    //append追加切片
    slice = append(slice, slice...)
    fmt.Printf("slice=%v;slice地址=%p\n", slice, &slice)
    sliceTemp := []string{"str7", "str8", "str9"}
    slice = append(slice, sliceTemp...)
    fmt.Printf("slice=%v;slice地址=%p\n", slice, &slice)
```
######append操作的本质就是对切片的指向的数组扩容，go底层会创建一个新的数组newArr，将切片原来包含的元素拷贝到新的数组newArr去，然后slice重新引用到newArr，newArr也是程序看不到的
切片的拷贝copy,类型必须是切片，拷贝出来的切片数据空间是独立的，互不影响
```
    slice := []int{1, 2, 3}
    var copySlice = make([]int, 10)
    fmt.Printf("copySlice=%v;copySlice=%p\n", copySlice, &copySlice)
    copy(copySlice, slice)
    fmt.Printf("copySlice=%v;copySlice=%p\n", copySlice, &copySlice)
	//虽然长度是1，去拷贝，仍然不会报错
	var copySlice1 = make([]int, 1)
	copy(copySlice1, slice)
	fmt.Printf("copySlice1=%v;copySlice1=%p\n", copySlice1, &copySlice1)
```
string&slice
######string底层是一个byte数组，所以string也可以进行切片
```
	str:="hello world"
	slice:=str[1:9]
	fmt.Printf("slice=%v;slice地址=%p\n", slice, &slice)
```
######string不能被修改，如果要修改，先转成切片[]byte或者[]rune修改，重新转成string
```
	//修改字符串
	changeSlice := []byte(str)
	changeSlice[0] = 'z'
	str = string(changeSlice)
	fmt.Printf("str=%v;str地址=%p\n", str, &str)
	//修改成中文字符串
	changeSlice1 := []rune(str)
	changeSlice1[0] = '中'
	str = string(changeSlice1)
	fmt.Printf("str=%v;str地址=%p\n", str, &str)
```
