package com.zcr.codeblock04;

public class Test {
    public static void main(String[] args) {
        B b = new B();
    }
}

class A {
    {
        System.out.println("A的代码块");
    }
    public A() {
        System.out.println("A的构造方法");
    }
}

class B extends A {
    {
        System.out.println("B的代码块");
    }

    public B() {
        System.out.println("B的构造方法");
    }
}
