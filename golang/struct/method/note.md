###方法
######go中的方法是作用在指定的数据类型上的（即和指定的数据类型绑定），因此自定义类型都可以有方法，而不仅仅是结构体才有
案例存放在：struct/method/demo/main.go
######方法的简单使用
案例存放在：struct/method/demo1/main.go
######方法的调用和传参机制和函数基本一致，不同的是方法调用时会将调用方法的变量，当做实参也传递给方法，如果是值类型，那么就是值拷贝，如果是引用类型，那么就是地址拷贝
######方法绑定结构体指针变量，提高传递效率，修改结构体外部的值
案例存放在：struct/method/demo2/main.go
######go中的方法作用在指定的数据类型上的，因此type出来的自定义类型都可以有方法，例如int，int64等
案例存放在：struct/method/demo3/main.go
######如果一个类型实现了String()这个方法，那么fmt.Println会调用这个变量的默认的String()进行输出
案例存放在：struct/method/demo4/main.go
######方法的控制范围和函数一样，大小写区分