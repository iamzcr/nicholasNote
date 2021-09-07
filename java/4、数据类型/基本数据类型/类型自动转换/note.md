自动类型转换
java程序在进行赋值或者运算时，精度小的类型自动转换为精度大的数据类型，具体轨迹
char=>int=>long=>float=>double
byte=>short=>int=>long=>float=>double
1、有多种类型的数据混合运算是，系统首先自动将所有数据转换成容量最大的数据类型，然后再进行计算
2、(byte，short)和char之间不会相互转换
3、byte，short,char可以运算，计算时候首先转成int类型
4、boolean不参与自动转换