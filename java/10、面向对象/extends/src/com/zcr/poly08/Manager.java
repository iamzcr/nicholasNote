package com.zcr.poly08;

public class Manager extends Employee {
    private double bonus;

    public Manager(String name, double salary, double bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    public void manage() {
        System.out.println("经理：" + getName() + "在安排工作");
    }

    @Override
    public double getAnnual() {
        return super.getAnnual() + bonus;
    }
}
