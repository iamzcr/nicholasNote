package com.zcr.abstract02;

public class Abstract02 {
}

abstract class Animal {
    private String name;


    public abstract void eat();
}

class Dog extends Animal {
    //如果一个子类继承了抽象类，就必须实现父类的抽象方法，除非这个子类本身也是抽象类
    public void eat() {
        System.out.println("dog eat");
    }
}

//如果一个子类继承了抽象类，就必须实现父类的抽象方法，除非这个子类本身也是抽象类
abstract class Cat extends Animal {

}