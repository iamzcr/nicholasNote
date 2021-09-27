package com.zcr.work03;

public class Test {
    public static void main(String[] args) {
        Phone phone = new Phone();
        //底层生成一个类实现了Calcul的接口，并创建了一个对象，编译类型是Calcul，运行类型就是匿名内部类
        phone.testWork(new Calcul() {
            @Override
            public double work(double n1, double n2) {
                return n1 * n2;
            }
        }, 10, 8);
    }
}
