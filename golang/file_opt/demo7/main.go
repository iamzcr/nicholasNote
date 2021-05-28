package main

import (
	"bufio"
	"fmt"
	"io"
	"os"
)

type Total struct {
	Englishchar int
	Numberchar  int
	Emptychar   int
	Otherchar   int
}

func main() {
	//返回的是文件对象也叫file指针，或者file文件句柄
	file, err := os.Open("F:/go/src/golangStudy/file_opt/you.txt")
	if err != nil {
		fmt.Println(err)
	}
	//当函数退出时，要及时关闭file
	defer file.Close()

	var total Total
	//带缓冲，默认大小4096，缓冲的作用，不一次性读取文件到内存
	reader := bufio.NewReader(file)
	for {
		//读到一个换行符就结束一次
		str, err := reader.ReadString('\n')
		strRune := []rune(str)//注意中文字符
		for _, v := range strRune {
			switch true {
			case v >= 'a' && v <= 'z':
				fallthrough
			case v >= 'A' && v <= 'Z':
				total.Englishchar++
			case v >= '0' && v <= '9':
				total.Numberchar++
			case v >= ' ' && v <= '\t':
				total.Emptychar++
			default:
				total.Otherchar++
			}
		}
		//io.EOF表示读到了文件的末尾
		if err == io.EOF {
			break
		}
	}
	fmt.Println(total)
}
