//闭包应用
package main

import (
	"fmt"
	"strings"
)

func makeSuffix(suffix string) func(string) string {
	return func(fileName string) string {
		if !strings.HasSuffix(fileName, suffix) {
			return fileName + suffix
		}
		return fileName
	}
}
func main() {
	checkFile := makeSuffix(".jpg")
	fmt.Println(checkFile("test.jpg"))
	fmt.Println(checkFile("my"))
}
