package com.zcr.override01;

public class Sub extends Base {
    //重写的了base类的test方法
    public void test() {
        System.out.println("sub.test()");
    }

    //method01方法和父类的方法返回类型是父子关系，String是Object的子类
    public String method01() {
        return null;
    }

    //子类方法不能缩小父类的访问权限,可以扩大
    public void method02() {
        System.out.println("sub.method02()");
    }
}