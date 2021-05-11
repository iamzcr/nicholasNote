获取用户终端输入
fmt.Scanf
    var name string
	var age byte
	var sal float32
	var isPass bool
	fmt.Println("请输入姓名,年龄，薪酬，是否通过考试,空格隔开：")
	fmt.Scanf("%s %d %f %t", &name, &age, &sal, &isPass)
	fmt.Printf("名字：%v;\n年龄：%v;\n薪酬：%v;\n是否通过考试：%v\n", name, age, sal, isPass)
fmt.Scanln
	var name string
	var age byte
	var sal float32
	var isPass bool
	fmt.Println("请输入姓名：")
	fmt.Scanln(&name)
	fmt.Println("请输入年龄：")
	fmt.Scanln(&age)
	fmt.Println("请输入薪酬：")
	fmt.Scanln(&sal)
	fmt.Println("请输入是否通过考试：")
	fmt.Scanln(&isPass)
	fmt.Printf("名字：%v;\n年龄：%v;\n薪酬：%v;\n是否通过考试：%v\n", name, age, sal, isPass)
