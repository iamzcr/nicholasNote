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
闭包就是一个函数和与其相关的引用环境组合的一个整体
