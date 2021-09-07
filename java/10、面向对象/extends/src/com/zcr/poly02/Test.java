//多态向上转型
package com.zcr.poly02;

public class Test {
    public static void main(String[] args) {
        //向上转型:父类的引用指向子类的对象
        //父类类型 引用名 = new 子类类型
        //animal可以调用父类所有成员，要遵循访问修饰符，不能调用子类特有成员(catchMouse)，运行效果看子类的实现
        //因为在编译阶段，能调用那些成员，是有编译类型决定的
        Animal animal = new Cat();
        animal.sleep();
        animal.eat();
    }
}
