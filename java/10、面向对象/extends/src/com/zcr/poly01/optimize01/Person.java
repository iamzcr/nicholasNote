package com.zcr.poly01.optimize01;

public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //对象多态实现，
    // food 编译类型是Food，可以指向Food之类的对象
    // animal 编译类型是Animal，可以指向Animal之类的对象
    public void feed(Animal animal, Food food) {
        System.out.println("主人" + name + "给" + animal.getName() + "吃" + food.getName());
    }

}
