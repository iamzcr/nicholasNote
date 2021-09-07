package com.zcr.codeblock02;

public class Test {
    public static void main(String[] args) {
        //类是什么时候加载的:创建对象实例时(new)
        C c = new C();
        //类是什么时候加载的:创建子类对象实例，父类也会被加载
        B b = new B();
        //类是什么时候加载的:使用类的静态成员(方法和属性)，如果只是使用类的静态成员，普通代码块并不会执行
        System.out.println(Cat.name);
    }
}

class Cat {
    public static String name = "test";

    static {
        System.out.println("Cat的static代码块");
    }

    {
        System.out.println("Cat的普通代码块");
    }
}

class C {
    static {
        System.out.println("C的static代码块");
    }
}

class A {
    static {
        System.out.println("A的static代码块");
    }
}

class B extends A {
    static {
        System.out.println("B的static代码块");
    }
}
