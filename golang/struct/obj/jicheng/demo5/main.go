package main

import "fmt"

type Goods struct {
	Name  string
	price float64
}
type Brand struct {
	Name    string
	address string
}

//多重继承
type Tv struct {
	Goods
	Brand
}
type Tv2 struct {
	*Goods
	*Brand
}

func main() {
	tv := Tv{Goods{
		Name:  "TEST",
		price: 50,
	}, Brand{
		Name:    "ZCR",
		address: "CHINA",
	}}
	fmt.Println(tv)
	tv2 := Tv{Goods{"TEST", 50,}, Brand{"ZCR", "CHINA",}}
	fmt.Println(tv2)
	tv3 := Tv2{&Goods{
		Name:  "TEST",
		price: 50,
	}, &Brand{
		Name:    "ZCR",
		address: "CHINA",
	}}
	fmt.Println(tv3)
	fmt.Println((*tv3.Goods).Name)
	fmt.Println(tv3.Goods.Name)

}
