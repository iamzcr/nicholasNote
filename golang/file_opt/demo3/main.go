package main

import (
	"bufio"
	"fmt"
	"os"
)

func main() {
	//os.O_WRONLY | os.O_CREATE:只写方式打开，如果不存在则创建
	file, err := os.OpenFile("F:/go/src/golangStudy/file_opt/my.txt", os.O_WRONLY|os.O_CREATE, 0666)
	if err != nil {
		fmt.Println(err)
		return
	}

	//及时关闭file句柄
	defer file.Close()

	str := "abc English\r\n" //\r\n兼容不同编辑器不换行的问题
	//写入时，使用带缓存的*Writer
	writer := bufio.NewWriter(file)
	for i := 0; i < 5; i++ {
		writer.WriteString(str)
	}
	//writer是带缓存，因此在调用WriteString时候内容是先写入到缓存，不落盘,需要执行writer.Flush()写入硬盘
	writer.Flush()

}
