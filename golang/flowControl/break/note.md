###break
使用场景，统计生产随机数值等于99，一共用了多少次
```
    //time.Now(),返回一个time类型的值，time.Now().Unix()返回一个1970-01-01到现在的秒数，time.Now().UnixNano()纳秒
    //rand.Seed(time.Now().Unix())
    //n := rand.Intn(100)
    //fmt.Println(n)
    count := 0
    for {
        //rand.Seed(time.Now().Unix())
        rand.Seed(time.Now().UnixNano())
        n := rand.Intn(100)+1
        count++
        if n == 99 {
            break
        }
    }
    fmt.Printf("一共执行%d次", count)
```
####break中断for循环或者跳出switch语句
######break语句出现在多层嵌套的语句块时候，默认会中断或者跳出最近的那个循环
```
    for i := 0; i <= 3; i++ {
        for j := 0; j <= 5; j++ {
            if j == 2 {
                break //默认会中断或者跳出最近的那个循环
            }
            fmt.Println("j=", j)
        }

    }
```
######break语句出现在多层嵌套的语句块时候，可以通过标签指明要终止的是哪一层语句块
```
lable1:
	for i := 0; i <= 3; i++ {
		//lable2:
		for j := 0; j <= 5; j++ {
			if j == 2 {
				break lable1 //加上一个标签，指定跳出哪个循环
			}
			fmt.Println("j =", j)
		}
	}
```