package com.zcr.poly01.polyobject;

public class Test {
    public static void main(String[] args) {
        //对象多态
        //编译类型是animal，运行类型是Dog
        Animal animal  = new Dog();
        //编译类型是animal,animal运行类型是Dog ,所以cry是Dog的cry
        animal.cry();
        //编译类型是animal,运行类型是Cat
        animal  = new Cat();
        //编译类型是animal,animal运行类型是Cat ,所以cry是Cat的cry
        animal.cry();
    }
}
