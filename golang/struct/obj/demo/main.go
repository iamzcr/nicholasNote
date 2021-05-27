package main

import "fmt"

type Student struct {
	Name   string
	Gender string
	Age    int
	Id     int
	Score  float64
}

func (s *Student) say() string {
	str := fmt.Sprintf("Name=%v;Gender=%v;Age=%v;Id=%v;Score=%v", s.Name, s.Gender, s.Age, s.Id, s.Score)
	return str
}
func main() {
	stu := Student{
		Name:   "zcr",
		Gender: "man",
		Age:    10,
		Id:     1,
		Score:  111,
	}
	str := stu.say()
	fmt.Println(str)
}
