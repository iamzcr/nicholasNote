package com.zcr.obj01;

public class ToString01 {
    public static void main(String[] args) {
        Test test = new Test("test", "eat", 1000);
        System.out.println(test.toString());
    }
}

class Test {
    private String name;
    private String job;
    private double salary;

    public Test(String name, String job, double salary) {
        this.name = name;
        this.job = job;
        this.salary = salary;
    }

    @Override
    public String toString() {//重写object类的toString
        return "Test{" +
                "name='" + name + '\'' +
                ", job='" + job + '\'' +
                ", salary=" + salary +
                '}';
    }
}