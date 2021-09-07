//多态向下转型
package com.zcr.poly03;

public class Test {
    public static void main(String[] args) {
        Animal animal = new Cat();
        //语法：子类类型 引用名 = (子类类型) 父类引用
        //只能强制转换父类的引用，不能转换父类的对象
        Cat cat = (Cat) animal;
        //要求父类的引用必须指向的是当前目标类型的对象
        //Cat cat = (Dog) animal;//当前目标类型的对象是Cat，不是Dog，所以这样向下转型会报错
        //向下转型后，可以调用子类型中的所有成员
        cat.catchMouse();
    }
}
