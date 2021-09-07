package com.zcr.static02;

public class Test {
    public static void main(String[] args) {
        Demo demo = new Demo();
        //类变量随着类的加载而创建的，所以即使没有创建对象实例也能访问
        System.out.println(Demo.name);
        System.out.println(demo.name);
    }
}

class Demo {
    public static String name = "test";
}
