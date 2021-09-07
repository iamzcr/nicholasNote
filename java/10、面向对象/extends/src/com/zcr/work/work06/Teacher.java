package com.zcr.work.work06;

public class Teacher extends Person {
    private double workAge;

    public Teacher(String name, String sex, int age, double workAge) {
        super(name, sex, age);
        this.workAge = workAge;
    }

    public double getWorkAge() {
        return workAge;
    }

    public void setWorkAge(double workAge) {
        this.workAge = workAge;
    }

    public void teach() {
        System.out.println(getName() + "teach");
    }

    public String play() {
        return super.play() + "爱玩下棋";
    }

    public void printInfo() {
        System.out.println("教师信息：");
        System.out.println(super.baseInfo());
        System.out.println("工龄：" + workAge);
        teach();
        System.out.println(play());
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "workAge=" + workAge +
                '}' + super.toString();
    }
}
