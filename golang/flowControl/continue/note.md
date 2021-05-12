###continue
######continue结束本次循环，继续执行下一次循环
######continue语句出现在多层嵌套的语句块时候，可以通过标签指明要跳过的是哪一层语句块，和break的标签使用规则是一样的
```
lable1:
	for i := 0; i < 4; i++ {
		//lable2:
		for j := 0; j < 10; j++ {
			if j == 2 {
				//continue//默认跳出最近的循环的本次循环
				continue lable1 //加上一个标签，指定跳出哪个循环的本次循环
				//continue lable2
			}
			fmt.Println("j=", j)
		}
	}
```
###goto
######goto语句可以无条件地转移到程序中指定的行
######goto语句通常与条件语句配合使用，可用来实现条件转移，跳出循环体
######一般不主张使用，容易造成混乱
```
	num := 10
	fmt.Println("success")
	if num > 20 {
		goto lable
	}
	fmt.Println("success1")
lable:
	fmt.Println("success3")
```
###return
######一般使用在方法或者函数中，表示跳出或者结束所在的方法或者函数
######如果return在main中使用，标识终止程序