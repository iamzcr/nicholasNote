package com.zcr.final03;

public class Test {
    public static void main(String[] args) {
        System.out.println(A.num2);
        System.out.println(A.num);
    }
}

class A {

    public static double num = 1;
    //当我们使用final和static配合使用时候，如果我们想要获取num2静态属性，static代码块不会被加载，提高性能
    public final static double num2 = 1;

    static {
        System.out.println("static");
    }
}
