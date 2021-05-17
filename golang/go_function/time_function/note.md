######获取当前时间
	mytime := time.Now()
	fmt.Printf("%v===%T\n", mytime, mytime)
	fmt.Printf("%v===%T\n", mytime.Year(), mytime.Year())
	fmt.Printf("%v===%T\n", mytime.Month(), mytime.Month())
	fmt.Printf("%v===%v===%T\n", int(mytime.Month()), mytime.Month(), mytime.Month())
	fmt.Printf("%v===%T\n", mytime.Day(), mytime.Day())
	fmt.Printf("%v===%T\n", mytime.Hour(), mytime.Hour())
	fmt.Printf("%v===%T\n", mytime.Minute(), mytime.Minute())
	fmt.Printf("%v===%T\n", mytime.Second(), mytime.Second())
	fmt.Printf("%d-%d-%d %d:%d:%d\n", mytime.Year(), mytime.Month(), mytime.Day(), mytime.Hour(), mytime.Minute(), mytime.Second())
	timeStr := fmt.Sprintf("%d-%d-%d %d:%d:%d", mytime.Year(), mytime.Month(), mytime.Day(), mytime.Hour(), mytime.Minute(), mytime.Second())
	fmt.Printf("%v===%T\n", timeStr, timeStr)
	fmt.Printf("%v===%T\n", mytime.Format("2006-01-02 15:04:05"), mytime.Format("2006-01-02 15:04:05"))
	fmt.Printf("%v===%T\n", mytime.Format("15:04:05"), mytime.Format("15:04:05"))
	fmt.Printf("%v===%T\n", mytime.Format("2006-01-02"), mytime.Format("2006-01-02"))
	fmt.Printf("%v===%T\n", mytime.Format("2006"), mytime.Format("2006"))
	fmt.Printf("%v===%T\n", mytime.Format("01"), mytime.Format("01"))
	fmt.Printf("%v===%T\n", mytime.Format("02"), mytime.Format("02"))
######时间常量
	i := 0
	for {
		i++
		fmt.Println("time.Sleep")
		//time.Sleep(time.Second)//秒
		time.Sleep(time.Millisecond) //毫秒
		time.Sleep(time.Microsecond) //微秒
		time.Sleep(time.Nanosecond)  //纳秒
		if i == 100 {
			break
		}
	}
######获取时间戳，用于获取随机的数字，例如用rand获取随机数，如果不设计，每次获取都是一样的
	unixTime := time.Now().Unix()
	fmt.Printf("%v===%T\n", unixTime, unixTime)
	unixNanoTime := time.Now().UnixNano()
	fmt.Printf("%v===%T\n", unixNanoTime, unixNanoTime)

	count := 0
	for {
		//rand.Seed(time.Now().Unix())
		rand.Seed(time.Now().UnixNano())
		n := rand.Intn(100) + 1
		count++
		if n == 99 {
			break
		}
	}
	fmt.Printf("一共执行%d次", count)

