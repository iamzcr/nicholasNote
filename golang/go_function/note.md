###内置函数
####init函数
######每个源文件都可以包含一个init函数，该函数会在main函数执行前，被go运行框架调用，也就是init在main函数之前调用
```//init函数，完成一些初始化的工作
func init() {
	fmt.Println("main init")
}
func main() {
	fmt.Println("main")
}
```
######如果一个文件同时包含全局变量，先执行全局变量->init函数->main函数
```
var age = test()
func test() int {
	fmt.Println("test")
	return 90
}

//init函数，完成一些初始化的工作
func init() {
	fmt.Println("main init")
}
func main() {
	fmt.Println("main----age=", age)
}
```
######如果一个文件同时包含全局变量，先执行全局变量->init函数->main函数
######如果有引入包,先执行引入的包的全局变量->引入包的init函数->main包全局变量->main包的init函数->main包的main函数
###匿名函数
######如果我们某个函数只是希望使用一次，可以使用匿名函数，也可以多次调用
######在定义的时候就调用匿名函数
```
	res := func(a, b int) int {
		return a + b
	}(10, 20)
	fmt.Println(res)
```
######匿名函数赋值给变量，通过变量去调用
```
	var function = func(a, b int) int {
		return a - b
	}
	res1 := function(20, 10)
	fmt.Println(res1)
```
######全局匿名函数，在全局变量中定义匿名函数
```
var (
	test = func(a, b int) int {
		return a * b
	}
)

func main() {
	fmt.Println(test(2, 2))
}
```
###闭包
闭包就是一个函数和与其相关的引用环境(变量)组成的一个整体
```
func AddUpper() func(int) int {
	var n int = 10
	return func(x int) int {
		n = n + x
		return n
	}
}
func main() {
	//我们调用了AddUpper()并把它的返回值赋值给了fn这个变量， 从此以后，我们再也没有调用过AddUpper()函数，
	//因此自始至终AddUpper()函数本身只执行过一次，那么AddUpper()函数内部的n变量自始至终也只初始化过一次，
	//同时因为AddUpper()的返回值是一个函数，所以我们用fn接收了AddUpper()的返回值之后，
	//每次调用fn()函数调用的并不是AddUpper()，而是AddUpper()返回的匿名函数。
	fn := AddUpper()
	fmt.Println(fn(1))
}
```
######AddUpper是一个函数，返回的数据类型是func(int) int
######上述案例中，下面这一块返回一个匿名函数，但是这个匿名函数引用函数外的n变量，因此这个匿名函数体和变量n就构成一个闭包
```
        var n int = 10
	return func(x int) int {
		n = n + x
		return n
	}

```
####总结
######一个闭包实例因为只调用了一次闭包方法，而后调用的都是闭包返回值中的函数，所以一个闭包实例自始至终只对闭包中的内部变量进行了一次初始化。
######因为我们用变量接收了闭包返回的函数，而这个函数有权访问闭包中的局部变量，所以我们可以一直访问这个闭包中的变量且改变该变量的值。
######闭包的实际应用
```
func makeSuffix(suffix string) func(string) string {
	return func(fileName string) string {
		if !strings.HasSuffix(fileName, suffix) {
			return fileName + suffix
		}
		return fileName
	}
}
func main() {
	checkFile := makeSuffix(".jpg")
	fmt.Println(checkFile("test.jpg"))
	fmt.Println(checkFile("my"))
}
```    
