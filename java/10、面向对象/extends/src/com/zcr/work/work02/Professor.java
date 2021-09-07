package com.zcr.work.work02;

public class Professor extends Teacher {
    public Professor(String name, int age, String post, double salary, double grade) {
        super(name, age, post, salary, grade);
    }

    @Override
    public void introduce() {
        System.out.println("教授信息");
        super.introduce();
    }
}
