package com.zcr.interface04;

public class Monkey {
    private String name;

    public Monkey(String name) {
        this.name = name;
    }

    public void jump() {
        System.out.println(name + "猴子本身会跳跃......");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
