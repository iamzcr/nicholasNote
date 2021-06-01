package main
//常量的访问机制也是通过首字母大小写控制访问范围
const (
	a = iota//表示给a赋值为0，b=a的基础上+1=2；c=b的基础上+1=3
	b
	c
)

func main() {
	//常量必须初始化
	const test = "test"
	//常量设置后不能修改
	//常量只能修饰bool，数值类型，string
}
