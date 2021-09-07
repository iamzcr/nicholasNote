package com.zcr.super02;

public class Sub extends Base {


    public void test() {
        System.out.println(super.n1);
        System.out.println(super.n2);
        System.out.println(super.n3);
        //super不能访问父类是private修饰的方法和属性(super.属性，super.方法)
        //System.out.println(super.n4);
        super.test100();
        super.test200();
        super.test300();
        //super不能访问父类是private修饰的方法和属性(super.属性，super.方法)
        //super.test400();
    }

    public void cal() {
        System.out.println("子类cal方法........");
    }

    public void sum() {
        //当之类中和父类成员(属性和方法)重名时候，为了访问父类的成员，必须使用super，如果没有重名，使用super，this和直接调用是一样的
        super.cal();
        cal();
        this.cal();

        cal1();
        this.cal1();
        super.cal1();
        System.out.println("子类sum方法........");
    }
}

