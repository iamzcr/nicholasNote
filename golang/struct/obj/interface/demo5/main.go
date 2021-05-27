package main

import "fmt"

type Monkey struct {
	Name string
}

type Bird interface {
	Fly()
}
type Fish interface {
	Swing()
}

func (m *Monkey) Climb() {
	fmt.Println(m.Name, "生下来就会爬树")
}

//这个结构体的猴子想飞翔和游泳，可以使用接口实现,
type SubMonkey struct {
	Monkey
}

//这个SubMonkey结构体的猴子实现了飞翔，但是Monkey没有，不影响Monkey的结构体
func (sm *SubMonkey) Fly() {
	fmt.Println(sm.Name, "因为实现了接口，所以我学会了鸟儿的飞行")
}

//这个SubMonkey结构体的猴子实现了游泳，但是Monkey没有，不影响Monkey的结构体
func (sm *SubMonkey) Swing() {
	fmt.Println(sm.Name, "因为实现了接口，所以我学会了鱼儿的游泳")
}
func main() {
	sMonkey := &SubMonkey{Monkey{Name: "齐天大圣"}}
	sMonkey.Climb()
	sMonkey.Fly()
	sMonkey.Swing()
}
