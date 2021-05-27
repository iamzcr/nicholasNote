package main

import (
	"fmt"
	"math/rand"
	"sort"
	"time"
)

type Hero struct {
	Name string
	Age  int
}

//HeroSlice数据类型实现https://studygolang.com/pkgdoc的sort包的type Interface interface {}接口
type HeroSlice []Hero

//切片的长度
func (hs HeroSlice) Len() int {
	return len(hs)
}

//使用什么标准排序，按年龄从小到大排序
func (hs HeroSlice) Less(i, j int) bool {
	return hs[i].Age < hs[j].Age
	//对姓名排序
	//return hs[i].Name> hs[j].Name
}

//比较后交换
func (hs HeroSlice) Swap(i, j int) {
	//temp := hs[i]
	//hs[i] = hs[j]
	//hs[j] = temp
	//交换的另外一种方式
	hs[i], hs[j] = hs[j], hs[i]
}
func main() {

	//对slice排序
	var slice = []int{1, 5, 2, 6, 8}
	//方式1：冒泡排序
	//方式2：go本身的方法
	sort.Ints(slice)
	fmt.Println(slice)

	//对结构体切片排序
	//定义一个存放hero结构体的切片
	var heroSlice HeroSlice

	//构造测试数据
	rand.Seed(time.Now().UnixNano())
	for i := 0; i < 10; i++ {
		hero := Hero{
			Name: fmt.Sprintf("英雄:%d", rand.Intn(100)),
			Age:  rand.Intn(100),
		}
		heroSlice = append(heroSlice, hero)
	}
	fmt.Println("排序前")

	for _, v := range heroSlice {
		fmt.Println(v)
	}
	//因为HeroSlice已经实现了type Interface interface {}接口，所以可以直接用sort.Sort方法去调用heroSlice变量
	sort.Sort(heroSlice)
	fmt.Println("排序后")
	for _, v := range heroSlice {
		fmt.Println(v)
	}
}
