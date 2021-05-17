###函数
```
func main() {
	num1, num2 := 2.9, 3.6
	var opt byte = '-'
	res := cal(num1, num2, opt)
	fmt.Println(res)
}
func cal(num1 float64, num2 float64, opt byte) float64 {
	var res float64
	switch opt {
	case '+':
		res = num1 + num2
	case '-':
		res = num1 - num2
	case '*':
		res = num1 * num2
	case '/':
		res = num1 / num2
	}
	return res
}
```
######1、在调用一个函数的时候，会给该函数分配一个新的空间，编译器会通过自身的处理让这个新的空间和其他栈区德柯空间区分开
######2、在每个函数对应的栈中，数据空间是独立的，不会混淆(引用变量除外)
######3、当一个函数调用完毕之后，程序会销毁对应的栈空间
######4、基本数据类型和数组，结构体默认都是值传递，在函数内修改，不会影响原来的值，指针，切片，map，chan，interface都是引用传递
######5、如果希望函数内的变量能修改函数外的变量，可以传入变量的地址&，函数内衣指针的方式操作变量
```
func main() {
	num := 20
	test(&num)
	fmt.Println(num)
}
func test(num *int) {
	//*num表示获取指向num存的地址所在的值
	*num = *num + 10
	fmt.Println(*num)
}
```
######6、go中，函数也是一种数据类型，可以赋值给一个变量，则该变量就是一个函数类型的变量，可以通过该变量调用函数
######7、函数既然作为一种数据类型，因此在go中，函数可以作为形参，并且调用
```
func main() {
	a := sum //把一个函数赋给a变量
	fmt.Printf("a的类型%T，sum的类型%T\n", a, sum)
	res := a(10, 40) //用a变量调用函数
	fmt.Printf("res=%v", res)
	myFun(a, 50, 60) //把一个函数当成参数传递
}

func sum(num1 int, num2 int) int {
	return num1 + num2
}

func myFun(function func(int, int) int, num1 int, num2 int) int {
	return function(num1, num2)
}
```
##### 8、为了简化数据类型的定义，go支持自定义数据类型，语法 type 自定义数据类型名 数据类型,例如:
######例如，type  myint int，这时myint可以等价于int来使用，又如type mySum func(int,int) int,这时mySum就等价于一个函数类型func(int,int) int
```
type myFuncType func(int, int) int //自定义数据类型
type myInt int                     //自定义数据类型,虽然都是int类型，go实际上认为这不是同一个类型，所以如果有一个类型为int的，一个是myInt的，实际上他们是不能相互赋值的

func main() {
	var num myInt = 666
	fmt.Printf("res=%v\n", num)
	res := myFun(getSum, 100, 120)
	fmt.Printf("res=%v\n", res)
}
func getSum(num1 int, num2 int) int {
	return num1 + num2
}
func myFun(function myFuncType, num1 int, num2 int) int {
	return function(num1, num2)
}

```
######9、go不支持函数重载
######10、可以直接对返回值命名
```
func main() {
	fmt.Println(getSum(1, 2))
}
func getSum(num1 int, num2 int) (sum int) {
	sum = (num1 + num2)
	return
}
```
######11、使用_标识符，忽略返回值
######12、支持可变参数，args...,args是slice(切片)，可以通过args[index],可以访问各个值,可变参数要放在形参列表的后面
```
func main() {
	sum := test(1, 1, 2, 31, 2, 31, 2, 31, 2, 31, 2, 3)
	sum1 := test(1)
	fmt.Println(sum)
	fmt.Println(sum1)
}
func test(num1 int, args ...int) int {
	sum := num1
	for i := 0; i < len(args); i++ {
		sum += args[i]
	}
	return sum
}
```
#######引用传递要比值传递效率要高，因为值传递拷贝的数据量会比较大
####return
######go函数可以返回多个值
######如果返回多个值的时候，在接收时，希望忽略某个返回值，使用_表示占位忽略
######只有一个返回值，可以不写()
####递归调用
######一个函数在函数体内又调用了本身，称为递归调用
######函数在递归调用的时，就创建了一个新的受保护的独立空间(新函数栈)
######函数的局部变量是独立的，不会相互影响
######递归必须向退出递归的条件逼近，否则会无限递归
######当一个函数执行完毕，或者遇到return，就会返回，遵守谁调用，就将结果返回给谁，当该函数执行完毕或者返回时，本身也会被销毁
```
//当执行main函数的时候，开辟一个栈空间，执行test函数，此时4>2条件成立，此时该栈区的值是3，但是因为有else存在，所以fmt.Println(num1)不执行
//开辟新栈区，调用自身，此时3>2条件成立，此时该栈区的值是2，但是因为有else存在，所以fmt.Println(num1)不执行
//开辟新栈区，继续调用自身，2>2条件不成立,执行else后面的语句，此时该栈区的值是2， 所以执行fmt.Println(num1)为2
//当不再开辟栈空间了，函数会按照返回之后才能执行剩下的语句，所以最后的结果是2
func test2(num1 int) {
	if num1 > 2 {
		num1--
		test2(num1)
	} else {
		fmt.Println(num1)
	}
}

//当执行main函数的时候，开辟一个栈空间，执行test函数，此时4>2条件成立，此时该栈区的值也就是fmt.Println(num1)为4--=3
//开辟新栈区，调用自身，此时3>2条件成立，此时该栈区的值也就是fmt.Println(num1)为3--=2
//开辟新栈区，继续调用自身，2>2条件不成立,此时不在调用自身函数 此时该栈区的值也就是fmt.Println(num1)为2
//当不再开辟栈空间了，函数会按照返回之后才能执行剩下的语句，所以最后的结果是2,2,3
func test(num1 int) {
	if num1 > 2 {
		num1--
		test(num1)
	}
	fmt.Println(num1)
}
```
###包
######包实际上就是建立不同的文件夹，存放程序文件。
######go的每个文件都属于一个包
######包通过首字母大小写控制作用域
######文件包名和通常和所在文件夹名保持一致，并用小写
######引入包取别名
```
util "golangStudy/function/package_demo/utils"
```
######同一个包下不能有相同的函数名，也不能有全局变量名
######如果要编译成可执行文件，就需要将包名设置为package main
```
go build -o bin\my.exe $GOPATH\golangStudy\function\package_demo\main
```