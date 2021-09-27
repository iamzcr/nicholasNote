package com.zcr.work02;

abstract class Animal {
    public abstract void shout();
}

class Cat extends Animal {
    @Override
    public void shout() {
        System.out.println("cat shout.....");
    }
}

class Dog extends Animal {
    @Override
    public void shout() {
        System.out.println("dog shout.....");
    }
}