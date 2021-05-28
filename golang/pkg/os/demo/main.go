package main

import (
	"fmt"
	"os"
)

//生成main.exe 然后main.exe test进行测试
func main() {
	fmt.Printf("命令行参数有%v\n", len(os.Args))
	for i, v := range os.Args {
		fmt.Printf("第%v个参数是%v\n", i, v)
	}
}
