package com.zcr.modifier;

public class A {
    public int n1 = 100;
    protected int n2 = 200;
    int n3 = 400;
    private int n4 = 300;

    public void m1() {
        //该方法可以访问四个属性
        System.out.println("n1=" + n1);
        System.out.println("n2=" + n2);
        System.out.println("n3=" + n3);
        System.out.println("n4=" + n4);
    }
}
