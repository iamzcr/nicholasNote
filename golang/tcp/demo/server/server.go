package main

import (
	"fmt"
	"io"
	"net"
)

func Process(conn net.Conn) {
	//循环接收客户端发送的数据
	defer conn.Close() //用完之后关闭连接
	for {
		buf := make([]byte, 1024)
		//如果客户端没有发东西，也就是没有Write，协程就一直阻塞在这里
		num, err := conn.Read(buf)
		//客户端连接退出了，这里也会报错,要退
		if err != nil {
			if err == io.EOF {
				fmt.Printf("client退出链接:%v\n", err)
			} else {
				fmt.Printf("server read error:%v\n", err)
			}
			return
		}
		//显示客户端的内容到服务端的终端,buf[:num]截取真正需要读取的数据
		fmt.Print(string(buf[:num]) + "\n")
	}
}
func main() {
	fmt.Println("server start listen...")
	listen, err := net.Listen("tcp", "0.0.0.0:8888")
	if err != nil {
		fmt.Println("server listen error ...")
		return
	}
	defer listen.Close()
	for {
		//等待客户端连接
		fmt.Println("wait client connect ...")
		conn, err := listen.Accept()
		if err != nil {
			fmt.Println("client connect error ...")
		}
		fmt.Printf("Accept()%v,客户端ip:%v\n", conn, conn.RemoteAddr().String())
		//接受的时候应该使用协程，因为如果在主线程接受，如果一个客户端阻塞了，全部客户端也阻塞了
		go Process(conn)
	}
}
