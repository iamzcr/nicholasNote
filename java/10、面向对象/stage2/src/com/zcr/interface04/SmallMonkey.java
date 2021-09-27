package com.zcr.interface04;

public class SmallMonkey extends Monkey implements Bird, Fish {
    public SmallMonkey(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println(getName()+"猴子实现了鸟的接口，学会了飞翔.....");
    }

    @Override
    public void swing() {
        System.out.println(getName()+"猴子实现了鱼的接口，学会了游泳.....");
    }
}
