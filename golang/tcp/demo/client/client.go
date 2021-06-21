package main

import (
	"bufio"
	"fmt"
	"net"
	"os"
	"strings"
)

func main() {
	conn, err := net.Dial("tcp", "127.0.0.1:8888")
	if err != nil {
		fmt.Println(" client dial error ...")
		return
	}
	//退出链接
	defer conn.Close()
	//发送信息,os.Stdin:标准输入，键盘输入，终端输入
	reader := bufio.NewReader(os.Stdin)
	for {
		//从终端读取信息，发送到服务器
		line, err := reader.ReadString('\n')
		if err != nil {
			fmt.Printf(" reader string error ...%v\n", err)
		}
		line = strings.Trim(line, "\r\n")
		if line == "exit" {
			//退出链接
			break
		}
		//发送line到服务端
		num, err := conn.Write([]byte(line))
		if err != nil {
			fmt.Printf(" conn.Write error ...%v\n", err)
		}
		fmt.Printf("发送了%v字节\n", num)
	}

}
