package com.zcr.modifier;

public class B {
    public void say() {
        System.out.println("调用say()方法");
        A a = new A();
        //同一个包下可以访问public，protect，默认，不能访问private
        System.out.println("n1=" + a.n1);
        System.out.println("n2=" + a.n2);
//        System.out.println("n3="+a.n4);报错
        System.out.println("n4=" + a.n3);
    }
}
