package com.zcr.static01;

public class ChildGame {
    public static void main(String[] args) {
        int count = 0;//count独立于对象，别的类很难调用，不符合oop编程思想
        Child child1 = new Child("test");
        child1.join();
        count++;
        Child child2 = new Child("test1");
        child2.join();
        count++;
        Child child3 = new Child("test2");
        child3.join();
        count++;
        System.out.println(count + "个小孩加入了游戏");
    }

}

class Child {
    private String name;

    public Child(String name) {
        this.name = name;
    }

    public void join() {
        System.out.println(name + "加入游戏");
    }
}