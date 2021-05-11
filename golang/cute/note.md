运算
如果两边变量为整型，那么+运算就是加法运算
如果两边变量是字符串，那么+运算就是字符串拼接

算术运算符
    对数值类型的变量进行运算的，比如：加减乘除
	//如果参与除法运算的都是整数，计算后去掉小数部分，留下整数，下面结果是2，不是2.5
	fmt.Println(10 / 4)
	var num float64 = 10 / 4
	fmt.Println(num)
	//如果希望保留小数部分，除法运算里面要有一个是小数
	fmt.Println(10.0 / 4)
	//取模运算
	//a % b = a - a / b * b
	fmt.Println(10 % 3)
	fmt.Println(-10 % 3) // -10 - (-10) / 3 * 3 = -10 - (-9) = -1
	// ++ ,--,go只有i++，i--，没有--i，++i
	var i int = 10
	i++ // i=i+1
	fmt.Println(i)
	i-- // i=i-1
	fmt.Println(i)
	//自增自减只能独立使用
	//var b  int
	//b = i--
赋值运算符
	var i int
	i = 10 //基本赋值
	a := 9
	b := 2
	a, b = b, a
	fmt.Println(a)
	fmt.Println(b)
	fmt.Println(i)
	//复合赋值
	b += 2
	fmt.Println(b)
比较运算符/关系运算符
1、返回值一定是bool值，true或者false
2、一般在if和循环结构使用
逻辑运算符
1、&&第一个为false，第二个条件不会再判断
2、||第一个为true，第二个条件不会在判断
3、!如果flag为true，那么！flag为false

位运算符
其他运算符
&：返回变量的存储地址，&a表示a变量的存储地址
*：指针变量 *a表示一个指针变量
	a := 100
	fmt.Println("a的地址：", &a)
	var ptr *int = &a
	fmt.Println("ptr指向的值是：", *ptr)