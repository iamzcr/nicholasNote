package monster

import (
	"bufio"
	"encoding/json"
	"fmt"
	"io/ioutil"
	"os"
)

type Monster struct {
	Name  string
	Age   int
	Skill string
}

func (m *Monster) Store() bool {

	str, err := json.Marshal(m)
	if err != nil {
		fmt.Println("json.Marshal error=", err)
		return false
	}

	fileName, err := os.OpenFile("F:/go/src/golangStudy/testing/demo1/monster/my.txt", os.O_RDWR|os.O_CREATE, 0666)
	if err != nil {
		fmt.Println("os.OpenFile error=", err)
		return false
	}
	defer fileName.Close()

	writer := bufio.NewWriter(fileName)
	_, err = writer.WriteString(string(str))
	if err != nil {
		fmt.Println("writer.WriteStringerror=", err)
		return false
	}

	err = writer.Flush()
	if err != nil {
		fmt.Println("writer.Flusherror=", err)
		return false
	}
	return true
}
func (m *Monster) ReStore() bool {
	fileData, err := ioutil.ReadFile("F:/go/src/golangStudy/testing/demo1/monster/my.txt")
	if err != nil {
		fmt.Println("ioutil.ReadFile error=", err)
		return false
	}
	err = json.Unmarshal(fileData, m)
	if err != nil {
		fmt.Println("json.Unmarshal error=", err)
		return false
	}
	fmt.Println(m)
	return true
}
