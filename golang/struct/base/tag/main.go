package main

import (
	"encoding/json"
	"fmt"
)

type Monster struct {
	Name  string
	Age   int
	Skill string
}

//加tag，返回小写
type Hero struct {
	Name  string `json:"name"`
	Age   int    `json:"age"`
	Skill string `json:"skill"`
}

func main() {
	monster := Monster{
		Name:  "monster",
		Age:   12,
		Skill: "kill",
	}
	//json是切片的字串
	jsonMonster, err := json.Marshal(monster)
	if err != nil {
		fmt.Println("jsonMonster error:", err)
	}
	fmt.Println("jsonMonster:", string(jsonMonster))

	hero := Hero{
		Name:  "hero",
		Age:   12,
		Skill: "kill",
	}
	//json是切片的字串
	jsonHero, err := json.Marshal(hero)
	if err != nil {
		fmt.Println("jsonHero error:", err)
	}
	fmt.Println("jsonHero:", string(jsonHero))
}
