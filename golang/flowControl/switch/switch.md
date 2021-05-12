###switch
####demo
```
        var b byte
	fmt.Println("请输入字符：")
	_, err := fmt.Scanf("%c", &b)
	if err != nil {
		fmt.Println(err)
	}
	switch b {
	case 'a':
		fmt.Println("星期1")
	case 'b':
		fmt.Println("星期2")
	default:
		fmt.Println("error")
	}
```
######switch语句用于基本不同条件执行不同动作，每一个case分支都是唯一的，从上到下逐一测试，直到匹配为止
######匹配项后面也不需要再加break
######default语句不是必须的
######case后的各个表达式的值的数据类型要和switch表达式数据类型一致
######case后面的表达式如果是常量值，则要求不能重复
```
	var num1 int32 = 40
	var num2 int32 = 20
	var num3 int32 = 70
	var num4 int64 = 70
	switch num1 {
	case num2,10,70://case后面的表达式可以有多个
		fmt.Println("success")
	case num3://case后面的表达式如果是常量值，编译不会报错
		fmt.Println("fail")
	case 70://case后面的表达式如果是常量值，编译会报错
		fmt.Println("fail const")
	case num4://case后的各个表达式的值的数据类型要和switch表达式数据类型一致
		fmt.Println("fail const")
	default://default语句不是必须的
		fmt.Println("error")
	}
```
######switch可以不跟表达式
```
       var num1 = 40
	switch {
	case num1 == 18: 
		fmt.Println("success")
	default:
		fmt.Println("fail")
	}
```
######switch可以直接声明一个变量,分号结束
```
        switch num1 := 40; {
	case num1 == 18:
		fmt.Println("success")
	default:
		fmt.Println("fail")
	}
```
######switch穿透：fallthrough，如果case语句块后面增加fallthrough，会继续执行下个case
```
        var num1 = 40
	switch num1 {
	case 40:
		fmt.Println("success one")
		fallthrough
	case 50:
		fmt.Println("success two")
	case 60:
		fmt.Println("success three")
	default:
		fmt.Println("fail")
```
######type-switch：switch语句还可以被用于type-switch判断某个interface变量中实际指向的变量类型
```
        var v interface{}
	var num1 = 40
	v = num1
	switch i := v.(type) {
	case int:
		fmt.Printf("success int V类型%T", i)
	case float64:
		fmt.Printf("success float64 V类型%T", i)
	default:
		fmt.Println("fail")
	}
```
