package main

import "fmt"

//接口
type Usb interface {
	//声明两个没有实现的接口的方法
	Start()
	Stop()
	//Test方法，Phone，Camer都没有实现，如果再用Phone去调用接口的方法，将会报错
	//Test()
}
type Phone struct {
}

//结构体Phone实现Usb接口的方法，Phone感觉不到实现了Usb接口，所有不存在显式实现
func (p Phone) Start() {
	fmt.Println("Phone start.......")
}
func (p Phone) Stop() {
	fmt.Println("Phone stop.......")
}

type Camer struct {
}

//结构体Camer实现Usb接口的方法
func (c Camer) Start() {
	fmt.Println("Camer start.......")
}
func (c Camer) Stop() {
	fmt.Println("Camer stop.......")
}

type Computer struct {
}

//Working接受一个usb接口类型的变量，只要实现了usb接口(实现了usb接口等于实现了usb接口声明的所有方法)
func (cop Computer) Working(usb Usb) { //usb变量会根据传入的实参来判断传入的是phone还是camer
	//通过usb接口变量，调用start和stop方法
	usb.Start()
	usb.Stop()
}

func main() {
	//创建结构体变量
	var cop Computer
	var camer Camer
	var phone Phone

	//调用，这里可以传进去，是因为phone和camer的结构体实现了usb接口
	cop.Working(phone)
	cop.Working(camer)

}
