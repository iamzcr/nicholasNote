package com.zcr.hashSet02;

import java.util.HashSet;
import java.util.Set;

public class HaseSet02 {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        Set set = new HashSet();
        //两个Dog对象，不相同，可以加进去
        set.add(new Dog("test"));
        set.add(new Dog("test"));

        //都在常量池，只能加进去一个
        set.add("666");
        set.add("666");

        set.add(new String("zcr"));
        set.add(new String("zcr"));
        System.out.println(set);
    }
}

class Dog {
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }
}
