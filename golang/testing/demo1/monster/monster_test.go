package monster

import "testing"

//monster.Store()测试用例
func TestStore(t *testing.T) {
	monster := &Monster{
		Name:  "zcr",
		Age:   10,
		Skill: "kill",
	}
	err := monster.Store()
	if err != true {
		t.Fatalf("monster.Store()测试不通过")
	}
	t.Logf("monster.Store()没问题，测试通过")
}
//monster.ReStore测试用例
func TestReStore(t *testing.T) {
	monster := &Monster{}
	err := monster.ReStore()
	if err != true {
		t.Fatalf("monster.ReStore()测试不通过 err=")
	}
	if monster.Name != "zcr"{
		t.Fatalf("monster.ReStore()测试不通过 err=")
	}
	t.Logf("monster.ReStore()没问题，测试通过")
}

