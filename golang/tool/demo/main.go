//删除切片多个元素
package main

import (
	"bufio"
	"fmt"
	"io"
	"os"
	"strings"
)

func delSlice(slice []byte, dels []byte) []byte {
	dMap := make(map[byte]bool)
	for _, s := range dels {
		dMap[s] = true
	}
	for i := 0; i < len(slice); i++ {
		if _, ok := dMap[slice[i]]; ok {
			slice = append(slice[:i], slice[i+1:]...)
			i = i - 1
		}
	}
	return slice
}
func ReadLine(fileName string) {
	f, err := os.Open(fileName)
	if err != nil {
		panic(err)
	}
	buf := bufio.NewReader(f)
	for {
		line, err := buf.ReadString('\n')
		if err != nil {
			if err == io.EOF {
				break
			}
		}
		line = strings.TrimSpace(line)
		slice := make([]byte, 1)
		slice = []byte(line)
		outSlice := make([]byte, 1)
		for i := 0; i < len(slice)-1; i++ {
			if slice[i] > 47 && slice[i] <= 58 {
				outSlice = append(outSlice, slice[i])
			}
		}
		inSlice := delSlice(slice, outSlice)
		str := string(inSlice)
		fmt.Println(str)

	}
}

func main() {
	ReadLine("./test.txt")
}
