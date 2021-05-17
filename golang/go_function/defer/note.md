###defer
######在函数中，经常需要创建资源(数据库链接资源，文件句柄资源，锁等)，为了在函数执行完毕后，及时地释放资源，提供了defer函数(延时机制)
```
func sum(a, b int) int {
	//当执行到defer时候，暂时不执行，将defer后面的语句放到独立的栈中
	//当函数执行完毕之后，再从栈中，按照先进后出的方式出栈，执行
	defer fmt.Println("a=", a)
	defer fmt.Println("b=", b)
	res := a + b
	fmt.Println("sum=", res)
	return res
}
func main() {
	res := sum(1, 2)
	fmt.Println("main=", res)
}
```
######在defer让栈的时候，会把相关的值也拷贝到栈中,如下面的a++和b++，defer已经把a和b已经入栈了，不会再改变
```
func sum(a, b int) int {
	//当执行到defer时候，暂时不执行，将defer后面的语句放到独立的栈中
	//当函数执行完毕之后，再从栈中，按照先进后出的方式出栈，执行
	defer fmt.Println("a=", a)
	defer fmt.Println("b=", b)
	a++
	b++
	res := a + b
	fmt.Println("sum=", res)
	return res
}
func main() {
	res := sum(1, 2)
	fmt.Println("main=", res)
}
```