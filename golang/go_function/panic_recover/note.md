###异常处理
######处理非致命错误(不用推出程序)
```
func test() {
	//使用defer和recover通过匿名函数抛出异常，让后面代码继续执行
	//写法1
	defer func() {
		err := recover()
		if err != nil {
			fmt.Println("err=", err)
			fmt.Println("发送错误=", err)
		}
	}()
	//写法2
	//defer func() {
	//	if err := recover(); err != nil {
	//		fmt.Println("发送错误=", err)
	//	}
	//}()
	a := 30
	b := 0
	res := a / b
	fmt.Println(res)
}
func main() {
	test()
	fmt.Println("success")
}
```
######处理致命错误
```
package main

import (
	"errors"
	"fmt"
)

func readConfig(name string) (err error) {
	if name == "test.ini" {
		return nil
	} else {
		//返回自定义错误
		return errors.New("读取配置文件错误")
	}
}
func test() {
	err := readConfig("test.yml")
	if err != nil {
		//使用panic终止程序
		panic(err)
	}
	fmt.Println("继续执行test....")
}
func main() {
	test()
	fmt.Println("继续执行main....")
}

```
