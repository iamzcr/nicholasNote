package com.zcr.abstract01;

public class Abstract01 {
    //new Abstract01();抽象类不能实例化
}

abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    //父类方法不确定性，将该方法设置为抽象方法，所谓抽象方法就是没有方法体
    //抽象类一般会被继承，由子类来实现其抽象方法
    /*
    public void eat() {
        System.out.println("动物不知道吃什么");
    }
    */
    public abstract void eat();
}