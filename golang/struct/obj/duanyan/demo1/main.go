package main

import "fmt"

type Usb interface {
	Start()
	Stop()
}
type Phone struct {
	Name string
}

func (p Phone) Start() {
	fmt.Println(p.Name, "Phone start.......")
}
func (p Phone) Stop() {
	fmt.Println(p.Name, "Phone stop.......")
}

//call方法在接口没有，是Phone结构体独有的方法
func (p Phone) Call() {
	fmt.Println(p.Name, "Phone call.......")
}

type Camer struct {
	Name string
}

func (c Camer) Start() {
	fmt.Println(c.Name, "Camer start.......")
}
func (c Camer) Stop() {
	fmt.Println(c.Name, "Camer stop.......")
}

type Computer struct {
}

func (cop Computer) Working(usb Usb) {
	usb.Start()
	//如果usb是指向phone变量的，还需要调用Phone方法,类型断言
	if phone, ok := usb.(Phone); ok == true {
		phone.Call()
	}

	usb.Stop()
}

func main() {
	//定义一个usb接口数组，存放phone和camer结构体变量
	var usbArr [3]Usb
	usbArr[0] = Phone{"vivo"}
	usbArr[1] = Phone{"xiaomi"}
	usbArr[2] = Camer{"nikang"}
	//Phone里面还有一个特有的方法Call()，遍历Usb数组，如果是phone变量
	//除了调用Usb接口声明的方法,还需要调用Phone的Call方法，这时候要用到断言
	var computer Computer
	for _, value := range usbArr {
		computer.Working(value)
	}

}
