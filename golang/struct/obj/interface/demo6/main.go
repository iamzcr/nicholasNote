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
	//定义一个usb接口数组，存放phone和camer结构体变量
	var usbArr [3]Usb
	usbArr[0] = Phone{}
	usbArr[1] = Phone{}
	usbArr[2] = Camer{}

	//因为所有类型都实现了空接口，所以我们可以把任何一个变量赋值给空接口
	var interfaceArr [3]interface{}
	interfaceArr[0] = 222
	interfaceArr[1] = "444"
	interfaceArr[2] = "5555"
	fmt.Println(usbArr)
	fmt.Println(interfaceArr)
}
