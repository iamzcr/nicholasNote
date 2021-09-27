八大Wrapper(包装类)类：
//Boolean：boolean  的引用类型
//Character：char  的引用类型
//Byte：byte  的引用类型
//Integer：int  的引用类型
//Long：long  的引用类型
//Float：float  的引用类型
//Double：double  的引用类型
//Short：short  的引用类型

为什么需要包装类
基本类型如 int 不是引用类型，也不是继承自 Object，所以 Java 需要一个这样的包装类(Integer：int)来使其面向对象的完整性。

装箱和拆箱：
装箱：基本数据类型到包装类，调用 valueOf 方法实现，比如 Integer.valueOf(100);
拆箱：包装类到基本数据类型，调用对应的 xxxValue 方法，比如 intValue() 方法。

自动装箱拆箱功能是 java1.5 后才有的。自动装箱拆箱时，由 Java 编译器自动实现转换。

赋值操作的时候，当两边类型不同，就会发生自动装箱拆箱。

因为包装类都是类，类下面的所有方法都能直接调用

String保存的是字符串常量，里面的值不能更改，每次String类实际更新的是更改地址，效率较低
stringBuffer保存的是字符串变量，里面的值可以更改，每次stringBuffer的更新实际上可以更新内容，不用每次更新地址，当空间大小不够的时候，才会扩展，效率会高一些，线性安全


stringBuilder
一个可变的字符序列，此类提供一个鱼stringBuffer兼容的api，但不保证同步(stringBuilder不是线性安全)，该类被设计用作stringBuffer的一个简易替换，用在字符串缓冲区被单个线程使用的时候，如果可能，建议优先采用该类，因为在大多数实现中，他比stringBuffer要快
stringBuilder上的主要操作是append和insert方法，柯重载这些方法，以接受任意类型的数据
StringBuilder方法没有做同步的处理，没有synchronized这个关键词

string = "a"；s+="b" 实际上原来的a字符串对象已经丢弃了，又产生了一个字符串s+"b",也就是ab，如果多次执行这些改变串内容的操作，会导致大量的副本字符串对象留在内存中，降低效率，如果这样的操作放到循环中，会极大影响程序的性能，所以，我们对string做大量修改的时候，不要使用string

如果字符串存在大量修改操作，一般使用stringBuilder和stringBuffer
如果字符串存在大量修改操作，单线程，一般使用stringBuilder
如果字符串存在大量修改操作，多线程，一般使用stringBuffer
如果字符串很少修改，被多个对象引用，使用String，比如配置信息等