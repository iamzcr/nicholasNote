package main

import (
	"bufio"
	"fmt"
	"io"
	"os"
)

func CopyFile(dstName, srcName string) (w int64, err error) {
	//打开已存在的源文件，构造reader
	srcFile, err := os.Open(srcName)
	if err != nil {
		fmt.Printf("err=%v\n", err)
		return
	}

	defer srcFile.Close()

	reader := bufio.NewReader(srcFile)

	//打开要copy的路径，如果没有就创建，构造writer
	dstFile, err := os.OpenFile(dstName, os.O_WRONLY|os.O_CREATE, 0666)
	if err != nil {
		fmt.Printf("err=%v\n", err)
		return
	}
	defer dstFile.Close()

	writer := bufio.NewWriter(dstFile)

	return io.Copy(writer, reader)

}
func main() {
	dstName := "E:/my.jpeg"
	srcName := "F:/go/src/golangStudy/file_opt/test.jpeg"
	_, err := CopyFile(dstName, srcName)
	if err == nil {
		fmt.Println("success")
	} else {
		fmt.Println(err)
	}
}
