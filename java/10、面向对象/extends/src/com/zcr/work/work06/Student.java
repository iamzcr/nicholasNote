package com.zcr.work.work06;

public class Student extends Person {
    private int stuId;

    public Student(String name, String sex, int age, int stuId) {
        super(name, sex, age);
        this.stuId = stuId;
    }

    public int getStuId() {
        return stuId;
    }

    public void setStuId(int stuId) {
        this.stuId = stuId;
    }

    public void study() {
        System.out.println(getName() + "study");
    }

    public String play() {
        return super.play() + "爱玩足球";
    }

    public void printInfo() {
        System.out.println("学生信息：");
        System.out.println(super.baseInfo());
        System.out.println("学号：" + stuId);
        study();
        System.out.println(play());
    }

    @Override
    public String toString() {
        return "Student{" +
                "stuId=" + stuId +
                '}' + super.toString();
    }
}
