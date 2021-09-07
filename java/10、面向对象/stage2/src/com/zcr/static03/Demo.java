package com.zcr.static03;

public class Demo {
    public static void main(String[] args) {
        Stu stu = new Stu("test");
        stu.payFee(1000);
        Stu stu1 = new Stu("test1");
        stu1.payFee(1000);
        Stu.showFee();
        stu1.test();
    }
}

class MyTools {
    public static double calSum(double n1, double n2) {
        return n1 + n2;
    }
}

class Stu {
    private String name;
    private static double fee = 0;

    public Stu(String name) {
        this.name = name;
    }

    public static void payFee(double fee) {
        Stu.fee += fee;
    }

    //静态方法只能访问静态变量
    public static void showFee() {
        System.out.println("总学费：" + Stu.fee);
    }

    //非静态方法，可以访问静态成员和非静态成员
    public void test() {
        System.out.println("总学费：" + Stu.fee);
        System.out.println("名字：" + this.name);
    }
}
