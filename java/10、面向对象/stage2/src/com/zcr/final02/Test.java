package com.zcr.final02;

public class Test {
    public static void main(String[] args) {
        new C().test();
    }
}

class B {
    //final修饰静态属性的时候，初始化位置只能是定义的时候，在静态代码块中，不能再构造方法中
    public static final double PI = 3.14;
    public static final double PI2;

    static {
        PI2 = 3.14;
    }

    public final void test() {
        System.out.println("final可以被继承");
    }
}

class C extends B {

}

class A {
    //定义的时候赋值
    public final double PI = 3.14;
    public final double PI2;
    public final double PI3;

    //构造方法中赋值
    public A() {
        PI2 = 3.14;
    }

    //代码块中
    {
        PI3 = 3.14;
    }
}