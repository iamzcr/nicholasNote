package com.zcr.poly05;

public class Sub extends Base {
    public int i = 20;

    public int getI() {//子类getI重写了父类的方法
        return i;
    }

    public int sum() {
        return i + 20;
    }

    public int sum1() {
        return i + 10;
    }
}
