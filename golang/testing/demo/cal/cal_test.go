package cal

import "testing"

//AddUpper测试用例
func TestAddUpper(t *testing.T) {
	res := AddUpper(10)
	if res != 55 {
		t.Fatalf("addUpper(10),实际值%v，期望值%v", res, 55)
	}
	t.Logf("addUpper(10)没问题，测试通过")
}

