package com.zcr.innerClass01;
//局部内部类
//类的五大成员
public class InnerClass01 {
}

class Outer {
    //属性
    private int num = 10;

    //构造方法
    public Outer(int num) {
        this.num = num;
    }

    //代码块
    {
        System.out.println("代码块");
    }

    //方法
    public void test() {
        System.out.println("test");
    }

    //内部类
    class Inner {

    }
}
