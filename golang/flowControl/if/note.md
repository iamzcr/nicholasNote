###流程控制
#####顺序控制，分支控制，循环控制
###顺序控制
######程序从上到下逐行执行，中间没有任何判断和跳转
###分支控制
####单分支
######单条件表达式为true的时候，执行程序
```
        var age int
	fmt.Println("请输入年龄：")
	_, err := fmt.Scanln(&age)
	if err != nil {
		return
	}
	if age > 18 {
		fmt.Println("年龄大于18")
	}
```
######go的if中可以直接定义一个变量
```
        if sex := 1; sex == 1 {
		fmt.Println("sex:", sex)
	}
```
####双分支
```
        var age int
	fmt.Println("请输入年龄：")
	_, err := fmt.Scanln(&age)
	if err != nil {
		return
	}
	if age > 18 {
		fmt.Println("年龄大于18")
	} else {
		fmt.Println("年龄不大于18")
	}
```
######双分支只会执行其中一个分支
####多分支
######多分支只会执行其中一个分支
```
        var grade int
	fmt.Println("请输入分数：")
	_, err := fmt.Scanln(&grade)
	fmt.Println(err)
	if grade == 100 {
		fmt.Println("perfect")
	} else if grade > 80 && grade <= 99 {
		fmt.Println("good")
	} else if grade > 60 && grade <= 80 {
		fmt.Println("warning")
	} else {
		fmt.Println("fail")
	}
```
######不允许把赋值语句放到条件语句里面，下面编译不通过
```
        var b bool = true
	if b = false{
		fmt.Println("success")
	}
```
######一元二次方程
```
    var a, b, c float64
	a, b, c = 3.0, 100, 6.0
	num := b*b - 4*a*c
	if num > 0 {
		x1, x2 := (-b+math.Sqrt(num))/2*a, (-b-math.Sqrt(num))/2*a
		fmt.Printf("x1=%v,x2=%v\n", x1, x2)
	} else if num == 0 {
		x1 := (-b + math.Sqrt(num)) / 2 * a
		fmt.Printf("x1=%vn", x1)
	} else {
		fmt.Printf("no answer")
	}
```
###嵌套分支
```   
    
var month int
	var age int
	fmt.Println("请输入月份：")
	_, err := fmt.Scanln(&month)
	if err != nil {
		return
	}
	fmt.Println("请输入年龄：")
	_, err = fmt.Scanln(&age)
	if err != nil {
		return
	}
	if month >= 4 && month <= 10 {
		if age > 60 {
			fmt.Println("20")
		} else if age >= 18 {
			fmt.Println("60")
		} else {
			fmt.Println("30")
		}
	} else {
		if age >= 18 {
			fmt.Println("40")
		} else {
			fmt.Println("20")
		}
	}
```

