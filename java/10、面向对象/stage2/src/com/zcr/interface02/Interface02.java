package com.zcr.interface02;

public interface Interface02 {
    public int n1 = 10;

    public void hi();

    //在jdk8后，可以有默认实现方法，但是需要使用default关键字修饰
    public default void ok() {
        System.out.println("ok........");
    }

    //jdk8后，可以有静态方法
    public static void test() {
        System.out.println("test........");
    }
}
