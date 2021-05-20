package main

import "fmt"

func userUpdate(user map[string]map[string]string, name string) {
	if user[name] != nil {

		user[name]["pass"] = "888888"
	} else {
		user[name] = make(map[string]string, 2)
		user[name]["pass"] = "666666"
		user[name]["nickname"] = "昵称" + name
	}
}
func main() {
	user := make(map[string]map[string]string)
	user["zcr"] = make(map[string]string, 2)
	user["zcr"]["pass"] = "999999"
	user["zcr"]["nickname"] = "昵称zcr"
	userUpdate(user, "zcr")
	userUpdate(user, "zsj")
	fmt.Println(user)
}
