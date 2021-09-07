package com.zcr.poly08;

public class Worker extends Employee {
    public Worker(String name, double salary) {
        super(name, salary);
    }

    public void work() {
        System.out.println("员工：" + getName() + "在工作");
    }

    @Override
    public double getAnnual() {//普通员工没有奖金，直接重写调用父类方法
        return super.getAnnual();
    }
}
