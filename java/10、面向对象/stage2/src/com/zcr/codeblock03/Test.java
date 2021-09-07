package com.zcr.codeblock03;


public class Test {
    public static void main(String[] args) {
        A a = new A();
    }
}

//创建对象时，在一个类的调用顺序：
//1、调用静态代码块和静态属性初始化，优先级是一样的，如果存在多个，按定义顺序来调用
//2、调用普通代码块和普通属性初始化，优先级是一样的，如果存在多个，按定义顺序来调用
//3、调用构造方法
class A {
    //静态属性初始化
    private static int n1 = getN1();

    //静态代码块
    static {
        System.out.println("A的static代码块........");
    }

    //普通属性初始化
    private int n2 = getN2();

    //普通代码块
    {
        System.out.println("A的普通代码块........");
    }

    public static int getN1() {
        System.out.println("getN1()......");
        return 100;
    }

    public int getN2() {
        System.out.println("getN2()......");
        return 200;
    }

    public A() {
        System.out.println("构造方法被调用......");
    }
}
