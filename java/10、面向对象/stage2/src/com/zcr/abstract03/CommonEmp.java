package com.zcr.abstract03;

public class CommonEmp extends Emp {
    public CommonEmp(String name, int id, double salary) {
        super(name, id, salary);
    }

    @Override
    public void work() {
        System.out.println("普通员工：" + getName() + "工作中");
    }
}
