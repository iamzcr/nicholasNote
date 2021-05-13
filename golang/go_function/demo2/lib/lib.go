package lib

import "fmt"

var (
	Age  int
	Name string
)

func init() {
	fmt.Println("lib init")
	Age = 100
	Name = "hello"
}
