###反射(reflect)
######反射可以再运行时动态获取变量的各种信息，比如变量的类型(type)，类别(kind)
######如果是结构体变量，还可以获取到结构体本身的信息，包括属性，方法
######通过反射，可以修改变量的值，可以调用关联的方法
######reflect.TypeOf(变量名)，获取变量的类型，返回reflect.Type类型
######reflect.ValueOf(变量名)，获取变量的值，返回reflect.Value类型，reflect.Value是一个结构体类型，获取更多的变量信息
######reflect.ValueOf(变量名)，获取变量的值，返回reflect.Value类型，reflect.Value是一个结构体类型，获取更多的变量信息
####反射使用
```
案例存放在：reflect/demo/main.go
案例存放在：reflect/demo1/main.go
```
####反射注意事项
######reflect.Value.Kind获取变量的具体数据类型分类(类别)，返回的是一个常量
######Type是类型，Kind是类别，他们可能相同，也可能不同
######通过反射修改原来的值（Elem()）
案例存放在：reflect/demo2/main.go
####反射的应用
######反射操作结构体
案例存放在：reflect/apply/main.go


