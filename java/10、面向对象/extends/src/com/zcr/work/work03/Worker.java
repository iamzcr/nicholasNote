package com.zcr.work.work03;

public class Worker extends Emp {

    public Worker(String name, double salary, double day, double level) {
        super(name, salary, day, level);
    }


    @Override
    public void info() {//员工和父类emp工资算法一样，直接继承复用即可
        System.out.println("普通员工工资...");
        super.info();
    }
}
