###二维数组
```
    //直接初始化
    var arr1 = [2][2]int{{1, 1},{1, 1}} 
    //先声明再初始化
    var arr [4][6]int
    fmt.Println(arr)
    arr[2][2]=1
    fmt.Println(arr)

```
####遍历
```
    var arr [4][6]int
    arr[2][2] = 1
    for i := 0; i < 4; i++ {
        for j := 0; j < 6; j++ {
            fmt.Print(arr[i][j]," ")
        }
        fmt.Println()
    }

    for _, value := range arr {
		for id, val := range value {
			fmt.Println(id, val)
		}
	}
```
####内存分析
```
	//如下二维数组再内存中存放其实是通过两个指针分别指向对应的一维数组
	var arr [2][3]int
	fmt.Printf("arr[0]的地址是%p\n", &arr[0])
	fmt.Printf("arr[0]的指向一维数组的地址arr[0][0]是%p\n", &arr[0][0])
	fmt.Printf("arr[1]的地址是%p\n", &arr[1])
	fmt.Printf("arr[1]的指向一维数组的地址arr[1][0]是%p\n", &arr[1][0])
```