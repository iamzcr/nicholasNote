package com.zcr.extend02;

public class Detail {
    public static void main(String[] args) {
        System.out.println("创建第一个对象...");
        Sub sub = new Sub();
        System.out.println("创建第二个对象...");
        //当创建子类对象时，不管子类使用那个构造方法，默认情况下总会去调用父类的无参构造方法
        Sub sub2 = new Sub("zcr");
        sub.sayOk();
    }
}
