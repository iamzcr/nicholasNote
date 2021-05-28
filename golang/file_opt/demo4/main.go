package main

import (
	"bufio"
	"fmt"
	"io"
	"os"
)

func main() {
	//os.O_WRONLY | os.O_TRUNC:只写方式打开并且清空
	//file, err := os.OpenFile("F:/go/src/golangStudy/file_opt/you.txt", os.O_WRONLY|os.O_TRUNC, 0666)
	//os.O_WRONLY | os.O_TRUNC:只写方式打开并且追加
	//file, err := os.OpenFile("F:/go/src/golangStudy/file_opt/you.txt", os.O_WRONLY|os.O_APPEND, 0666)
	//os.O_WRONLY | os.O_TRUNC:读写方式打开并且追加
	file, err := os.OpenFile("F:/go/src/golangStudy/file_opt/you.txt", os.O_RDWR|os.O_APPEND, 0666)
	if err != nil {
		fmt.Println(err)
		return
	}
	//及时关闭file句柄
	defer file.Close()

	//读取原来内容并显示
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

	str := "bbbbbbbbbb\n"
	//写入时，使用带缓存的*Writer
	writer := bufio.NewWriter(file)
	for i := 0; i < 5; i++ {
		writer.WriteString(str)
	}
	//writer是带缓存，因此在调用WriteString时候内容是先写入到缓存，不落盘,需要执行writer.Flush()写入硬盘
	writer.Flush()

}
