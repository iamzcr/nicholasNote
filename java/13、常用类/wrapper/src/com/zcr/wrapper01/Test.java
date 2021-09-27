package com.zcr.wrapper01;

public class Test {
    public static void main(String[] args) {
        //Boolean：boolean  的引用类型
        //Character：char  的引用类型
        //Byte：byte  的引用类型
        //Integer：int  的引用类型
        //Long：long  的引用类型
        //Float：float  的引用类型
        //Double：double  的引用类型
        //Short：short  的引用类型
        //Integer的装箱和拆箱（手动）
        //手动装箱
        int n1 = 100;
        Integer integer = Integer.valueOf(n1);
        Integer integer1 = new Integer(n1);
        //手动拆箱
        int i = integer.intValue();

        //三目运算符是一个整体，会提升精度
        Object obj = true ? new Integer(1) : new Double(2.0);
        System.out.println(obj);
        //jdk5后，就可以自动装箱
        int n2 = 200;
        Integer integer2 = n2;//底层帮你实现了valueOf方法
        System.out.println(integer2);
        //自动拆箱
        int n3 = integer2;
    }
}
