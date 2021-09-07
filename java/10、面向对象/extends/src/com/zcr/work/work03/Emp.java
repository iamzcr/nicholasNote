package com.zcr.work.work03;

public class Emp {
    private String name;
    private double salary;
    private double day;
    private double level;


    public Emp(String name, double salary, double day, double level) {
        this.name = name;
        this.salary = salary;
        this.day = day;
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getDay() {
        return day;
    }

    public void setDay(double day) {
        this.day = day;
    }

    public double getLevel() {
        return level;
    }

    public void setLevel(double level) {
        this.level = level;
    }

    public void info() {
        System.out.println("name：" + name + "工资为：" + salary * day * level);
    }
}
