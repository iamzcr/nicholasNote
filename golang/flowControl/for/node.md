###for循环
####语法
```
    for 循环变量初始化; 循环条件; 循环变量迭代 {
        循环操作
    }
```
####demo
```
	var i int
	for i = 1; i <= 10; i++ {
		fmt.Printf("%v：\n", &i)
		fmt.Printf("%d：hello world\n", i)
	}
	fmt.Printf("%d：hello world\n", i)
	j:=1
	for ; j <= 10; j++ {
		fmt.Printf("%v：\n", &j)
		fmt.Printf("%d：hello world\n", j)
	}
	fmt.Printf("%d：hello world\n", j)
```

####执行流程：
######循环变量初始化->循环条件(为真)->循环操作->循环变量迭代
######循环变量初始化->循环条件(为假)->退出循环
####细节
######循环条件返回的是一个bool值
######将变量初始化和迭代写到循环外的其他位置
```
        i := 1
	for i <= 10 {
		fmt.Printf("%d：hello world\n", i)
		i++
	}
```
######for{}等价于for;;{},表示一个无限循环，通常配合break使用
```
        k := 1
	for {
		if k <= 10 {
			fmt.Printf("%d：hello world\n",k)
		} else {
			break//break跳出循环
		}
		k++
	}
```
######for;;{}写法
```
        k := 1
        for ;;{
            if k <= 10 {
                fmt.Printf("%d：hello world\n",k)
            } else {
                break//break跳出循环
            }
            k++
        }
```
######如果字符串含有中文，传统的遍历字符串方式有问题，因为传统的遍历对字符串遍历是按照字节遍历的，一个汉字在utf8编码对应是三个字节，所以会出现乱码，需要将字符串转成[]rune切片去解决
```
	var str string = "test 中国"
	strRune := []rune(str)//把str拆分多个字符，转成一个存放类型为rune的切片
	for i := 0; i < len(strRune); i++ {
		fmt.Printf("%d：%c\n", i, str[i])
	}
```
######for range使用遍历字符串和数组,遍历是按照字符去遍历，所以中文不用转换
```
        var str string = "test 中国"
 	for index ,val := range str{
 		fmt.Printf("%d：%c\n", index, val)
 	}
```
######go中没有while和do...while语法，可以通过for...break实现

####多重循环



