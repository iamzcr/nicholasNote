package com.zcr.super01;

public class Sub extends Base {

    public Sub() {
        //super()访问构造器时候，要放在构造方法的第一行
        //super();
        super(1);
    }

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

}
