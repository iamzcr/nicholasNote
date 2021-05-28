package main

import (
	"bufio"
	"fmt"
	"io"
	"os"
)

func main() {
	//返回的是文件对象也叫file指针，或者file文件句柄
	file, err := os.Open("F:/go/src/golangStudy/file_opt/test.txt")
	if err != nil {
		fmt.Println(err)
	}
	//当函数退出时，要及时关闭file
	defer file.Close()

	//带缓冲，默认大小4096，缓冲的作用，不一次性读取文件到内存
	reader := bufio.NewReader(file)
	for {
		//读到一个换行符就结束一次
		str, err := reader.ReadString('\n')
		fmt.Printf(str)
		//io.EOF表示读到了文件的末尾
		if err == io.EOF {
			break
		}
	}
	fmt.Printf("文件读取结束")
}
