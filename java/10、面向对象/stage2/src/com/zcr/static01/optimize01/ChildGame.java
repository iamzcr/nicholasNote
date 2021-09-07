package com.zcr.static01.optimize01;

public class ChildGame {
    public static void main(String[] args) {
        Child child1 = new Child("test1");
        child1.join();
        child1.count++;
        Child child2 = new Child("test1");
        child2.join();
        child2.count++;
        //类变量可以通过类名直接访问，也可以通过任何一个实例对象访问
        System.out.println(Child.count + "个小孩加入了游戏");
        System.out.println(child1.count + "个小孩加入了游戏");
        System.out.println(child2.count + "个小孩加入了游戏");

    }

}

class Child {
    private String name;

    //count是一个静态变量，最大的特点就是被Child类的所有对象实例所共享
    public static int count = 0;

    public Child(String name) {
        this.name = name;
    }

    public void join() {
        System.out.println(name + "加入游戏");
    }
}