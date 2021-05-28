package cal

import "testing"
//GetSum测试用例
func TestGetSum(t *testing.T) {
	res := GetSum(10, 20)
	if res != 30 {
		t.Fatalf("TestGetSum(10),实际值%v，期望值%v", res, 30)
	}
	t.Logf("TestGetSum(10)没问题，测试通过")
}
