package com.zcr.poly01;

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

    //如果有多个动物和食物，则需要多个feed重载，不科学，多态封装，优化代码optimize01
    public void feed(Dog dog, Bone bone) {
        System.out.println("主人" + name + "给" + dog.getName() + "吃" + bone.getName());
    }
    public void feed(Cat cat, Fish fish) {
        System.out.println("主人" + name + "给" + cat.getName() + "吃" + fish.getName());
    }
}
