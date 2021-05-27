package main

import "fmt"

//学生
type Student struct {
	Name  string
	Age   int
	Score float64
}

//将学生的公有方法绑定到Student结构体
func (s *Student) ShowInfo() {
	fmt.Printf("学生名=%v;年龄=%v；成绩=%v\n", s.Name, s.Age, s.Score)
}
func (s *Student) SetScore(score float64) {
	s.Score = score
}

//小学生
type Pupil struct {
	Student //匿名结构体实现继承
}

//小学生考试
func (p *Pupil) Testing() {
	fmt.Printf("小学生考试中.......\n")
}

//大学生
type College struct {
	Student //匿名结构体实现继承
}

//大学生考试
func (c *College) Testing() {
	fmt.Printf("大学生考试中.......\n")
}

func main() {
	pupil := &Pupil{}
	pupil.Student.Name = "小学生"
	pupil.Student.Age = 10
	pupil.Testing()
	pupil.Student.SetScore(53.3)
	pupil.Student.ShowInfo()

	college := &College{}
	college.Student.Name = "大学生"
	college.Student.Age = 20
	college.Testing()
	college.Student.SetScore(66.3)
	college.Student.ShowInfo()
}
