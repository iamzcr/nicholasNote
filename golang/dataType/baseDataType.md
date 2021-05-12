###整型(默认是0)
####有符号：
######int (32位系统下是4个字节，64位系统下是8个字节)
######int8(一个字节，8位)   -128 - 127
######int16(两个字节，16位)
######int32(四个字节，32位)
######int64 (八个字节，64位)
######rune (和int32一样，表示1个unicode码)
####无符号：
######uint  (32位系统下是4个字节，64位系统下是8个字节)
######uint8 (一个字节，8位)  0-255
######uint16 (两个字节，16位)
######uint32 (四个字节，32位)
######uint64 (八个字节，64位)
######byte 和uint8等价，要存储单个字母字符时选用
######1、int额uint的大小和系统有关系
######2、golang的整型默认声明为int类型
    var n1 = 100
    fmt.Printf("%T", n1)
######3、查看变量的字节大小和数据类型
    var n2 int64 = 100
    fmt.Printf("数据类型是：%T，占用的字节数是%d\n", n2,unsafe.Sizeof(n2))
######4、在整型变量使用时，遵守保小不保大的原则，即：在保证程序正确运行下，尽量使用占用空间小的数据类型（如：年龄）
    var age uint8 = 100
    var age1 byte = 100
    fmt.Printf("age数据类型是：%T，age占用的字节数是：%d\n", age,unsafe.Sizeof(age))
    fmt.Printf("age1数据类型是：%T，age1占用的字节数是：%d\n", age1,unsafe.Sizeof(age1))

###浮点类型(默认是0)
float32(单精度，4个字节) 
float64(双精度，8个字节) 
1、浮点数在机器中存放形式：符号位+指数位+尾数位，说明浮点数都是有符号的
2、尾数部分可能丢失，造成精度丢失 -123.000000001
    var a float32 = -123.000000001
    var b float64 = -123.000000001
    fmt.Println("a = ", a)
    fmt.Println("b = ", b)
3、通常情况一般使用float64比float32更准确
4、golang的浮点型默认声明为float64类型
    var d = 5.123e2
    var f = .123
    var e = 5.123E2
    var g = 5.123E-2
    fmt.Println("d = ", d)
    fmt.Println("f = ", f)
    fmt.Println("e = ", e)
    fmt.Println("g = ", g)
    
字符型(默认是0)
没有专门的字符型(例如char)，使用byte来保存单个字母字符，
1、直接输出byte值，就是输出了对应的字符的码值
	var a byte = 'n'
	fmt.Println("a=", a)
2、如果我们希望输出对应的字符，需要使用格式化输出%c
	var b byte = '0'
	fmt.Printf("b=%c,b=%d\n", b, b)
3、当我们定义一个中文字符的时候，因为byte的长度是0-255，长度不够，我们通常用int来声明，所以字符的本质其实就是一个整数，例如我其实对应的UTF-8码值就是25105
	var c int = '我'
	fmt.Printf("c=%c,c=%d", c, c)
4、go语言的支付使用UTF-8编码
5、字符本质是一个整数，所以字符是可以运算的
	var d byte = '0'
	var e byte = '1'
	f := d + e
	fmt.Printf("f=%c,f=%d", f, f)
	
布尔型(默认是false)
1、bool类型占用一个字节
2、bool值只有true和false两个值，默认为false
	var a bool = false
	fmt.Printf("a数据类型是：%T，a占用的字节数是：%d\n", a,unsafe.Sizeof(a))
	
字符串(默认是空字符串)
字符串就是一串固定长度的字符链接起来的字节序列，go的字符串是由单个字节链接起来的，也就是相对于传统的字符串由字符组成，go是由字节组成的
1、字符串被赋值后，就不能被修改
2、双引号会识别转义字符，反引号可以直接原生形式输出，包括换行等特殊字符
3、字符串用+号拼接
	var a string = "hello world"
	fmt.Println(a)
	//反引号
	var b string = `hello world fmt.Println(a)\n`
	fmt.Println(b)
	//拼接
	var c string = "1111"
	c += "22222"
	fmt.Println(c)
	
数据类型转换
1、go的数据类型转换不能自动转换，要强制转换
2、go的数据转换可以低精度到高精度，也可以高精度到低精度
3、被转换的是变量存储的数据(即值)，变量本身的数据类型并没有发生变化
4、在转换中，高精度转低精度，编译不会报错，转换结果按溢出处理，和我们想要的结果不一样
    var test int = 1
    fmt.Printf("%T\n", test)
    var test1 float32 = float32(test)
    //test被转换的是变量存储的数据(即值)，test变量本身的数据类型并没有发生变化,还是int
    fmt.Printf("%T,%T\n", test1,test)
基本数据类型转字符串
1、fmt.Sprintf()转换，fmt.Sprintf("%参数", 表达式)，参数需要和表达是的数据类型相匹配，返回对应的字符串
	var num1 int = 6
	var num2 float64 = 6.2623
	var b bool = true
	var char byte = 'i'
	var str string
	str = fmt.Sprintf("%d", num1)
	fmt.Printf("str = %v;str = %T\n", str, str)
	str = fmt.Sprintf("%f", num2)
	fmt.Printf("str = %v;str = %T\n", str, str)
	str = fmt.Sprintf("%t", b)
	fmt.Printf("str = %q;str = %T\n", str, str)
	str = fmt.Sprintf("%c", char)
	fmt.Printf("str = %q;str = %T\n", str, str)
2、strconv包的函数转换
    var num1 int = 6
	var num2 float64 = 6.2623
	var num3 int = 666
	var b bool = true
	var str string
	//要转换的值，以十进制转换
	str = strconv.FormatInt(int64(num1), 10)
	fmt.Printf("str = %q;str = %T\n", str, str)
	//要转换的值，f形式，保留小数位10位，这个小数为float64
	str = strconv.FormatFloat(num2, 'f',10,64)
	fmt.Printf("str = %q;str = %T\n", str, str)
	//要转换的值
	str = strconv.FormatBool(b)
	fmt.Printf("str = %q;str = %T\n", str, str)
	//要转换的值
    str = strconv.Itoa(num3)
    fmt.Printf("str = %q;str = %T\n", str, str)
字符串转基本类型
1、strconv包的函数转换
    var str string = "true"
	var b bool
	b, _ = strconv.ParseBool(str)
	fmt.Printf("b = %v;b = %T\n", b, b)
	var str1 string = "99"
	var num1 int64
	//bitSize可认为实际上做了校验的功能,防止数据越界
	num1, _ = strconv.ParseInt(str1, 10, 0)
	fmt.Printf("num1 = %v;num1 = %T\n", num1, num1)
	var num2 int
	num2, _ = strconv.Atoi(str1)
	fmt.Printf("num2 = %v;num2 = %T\n", num2, num2)
	var str3 string = "99.099"
	var f float64
	f, _ = strconv.ParseFloat(str3,64)
	fmt.Printf("f = %v;f = %T\n", f, f)
2、string转基本数据类型的时候，要保证转成有效数据，不然直接转成0
