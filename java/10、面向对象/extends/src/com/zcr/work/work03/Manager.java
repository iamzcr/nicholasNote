package com.zcr.work.work03;

public class Manager extends Emp {
    private double bonus;

    public Manager(String name, double salary, double day, double level) {
        super(name, salary, day, level);
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public void info() {
        System.out.println("经理员工工资...");
        System.out.println("name：" + super.getName() + "工资为：" + (super.getSalary() * super.getDay() * super.getLevel() + bonus));
    }
}
