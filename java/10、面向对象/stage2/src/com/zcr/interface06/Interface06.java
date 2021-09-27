package com.zcr.interface06;

//接口的多态传递
public class Interface06 {
    //接口类型的变量可以指向实现了该接口的类的对象实例
    BB bb = new Teacher();
    //BB继承了AA接口，接口多态传递
    AA aa = new Teacher();
}

interface AA {

}

interface BB extends AA {

}

class Teacher implements BB {

}
