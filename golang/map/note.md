###map
####声明，声明不会分配内存，初始化需要make，然后才能赋值和使用
var mapTest map[int]string
####make初始化
var mapTest = make(map[int]string)
####map使用方式
```
	//第一种
	var mapTest1 map[string]string
	mapTest1 = make(map[string]string, 10)
	fmt.Println(mapTest1)
	//第二种
	mapTest2 := make(map[string]string, 10)
	fmt.Println(mapTest2)
	//第三种
	mapTest3 := map[string]string{
		"test": "test",
	}
```
####map的curd
######更新和增加：map[key]=value,如果key还没有，就是增加，存在就是更新
######删除：delete内置函数，如果key存在就删除，key不存在不处理 也不报错
######查找：val, res := map[key]，如果res为true，说明key存在，否则不存在
```
	var mapTest = make(map[string]string)
	mapTest["str1"] = "test"
	//如果key还没有，就是增加
	mapTest["str2"] = "test1"
	//如果key存在就是更新
	mapTest["str1"] = "test2"
	fmt.Println(mapTest)
	//map删除，删除只能逐个遍历删除，没有一次性删除，或者重新分配空间
	delete(mapTest, "str1")
	fmt.Println(mapTest)
	mapTest = make(map[string]string)
	fmt.Println(mapTest)
	//map查找
	val, res := mapTest["str1"]
	if(res){
		fmt.Printf("val=%v",val)
	}else {
		fmt.Println("key不存在")
	}
```
####获取map长度，len(map),遍历map
```
    var mapTest = make(map[string]string)
	mapTest["str1"] = "test"
	mapTest["str2"] = "test1"
	for index, value := range mapTest {
		fmt.Printf("%v==%v\n", index, value)
	}

	stuMap := make(map[string]map[string]string)
	stuMap["01"] = make(map[string]string)
	stuMap["01"]["name"] = "ceshi"
	stuMap["01"]["sex"] = "男"

	stuMap["02"] = make(map[string]string)
	stuMap["02"]["name"] = "ceshi1"
	stuMap["02"]["sex"] = "男1"
	for index, value := range stuMap {
		fmt.Printf("学号==%v；名字==%v；性别==%v\n", index, value["name"], value["sex"])
	}
```
####map切片
```
	slice := []map[string]string{}
	mapTest := map[string]string{
		"name": "test",
		"age": "1",
	}
	slice = append(slice, mapTest)
	mapTest = map[string]string{
		"name": "test1",
		"age": "22",
	}
	slice = append(slice, mapTest)
	fmt.Println(slice)


	var mySlice []map[string]string
	mySlice = make([]map[string]string, 2)
	if mySlice[0] == nil {
		mySlice[0] = make(map[string]string, 2)
		mySlice[0]["name"] = "test"
		mySlice[0]["age"] = "1"
	}
	if mySlice[1] == nil {
		mySlice[1] = make(map[string]string, 2)
		mySlice[1]["name"] = "tes1"
		mySlice[1]["age"] = "22"
	}

	mapAppend := map[string]string{
		"name": "test2",
		"age": "23",
	}
	mySlice = append(mySlice, mapAppend)
	fmt.Println(mySlice)
```
####map排序，map是无序的，也不是按照添加顺序来排序的，所以每次打印排序，都不一样，如果要排序，就先对key排序，然后再遍历key
```
	mapTest := make(map[int]int, 5)
	mapTest[1] = 1000
	mapTest[3] = 4
	mapTest[4] = 3
	mapTest[2] = 2
	var keys []int
	for k, _ := range mapTest {
		keys = append(keys, k)
	}
	sort.Ints(keys)
	fmt.Println(keys)
	for _, val := range keys {
		fmt.Printf("k=%v,v=%v\n", val, mapTest[val])
	}
```
####map注意事项
######map和切片一样也是引用传递，遵守引用传递的规则，函数接受map后，修改了，原来的map也会被修改
######map的value常用来存放结构体，比较好管理数据
```
    type stuInfo struct {
		Name string
		Age  int
		Add  string
	}
	stuMap := make(map[string]stuInfo)
	stu1 := stuInfo{
		Name: "test",
		Age:  2,
		Add:  "2222",
	}
	stu2 := stuInfo{
		Name: "test1",
		Age:  21,
		Add:  "1111",
	}
	stuMap["01"] = stu1
	stuMap["02"] = stu2
	for index, stu := range stuMap {
		fmt.Printf("学号==%v；名字==%v；年龄==%v;地址==%v\n", index, stu.Name, stu.Age,stu.Add)
	}
	fmt.Println(stuMap)
```
