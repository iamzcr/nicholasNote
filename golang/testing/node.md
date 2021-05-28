###单元测试
####传统测试
######在main函数中，调用需要测试的函数，看看实际结果和期望结果是否一致，判断函数实现是否正确
####单元测试：testing框架，go自带的testing可以进行功能测试和性能测试
案例存放在：testing/demo,进入到cal目录，执行go test(没错误，不输出)或者go test -v(输入日志),demo下面的cal_test.go和sum_test.go表示测试用例，cal.go里面存放被测试的函数
######一个测试文件中，可以有多个测试用例函数
######t.Fatalf方法终止程序，输出错误信息
######t.Logf输出信息
######测试单个文件，一定要带上被测试的源文件，go test -v cal_test.go cal.go
######测试单个方法，go test -v -test.run TestAddUpper
