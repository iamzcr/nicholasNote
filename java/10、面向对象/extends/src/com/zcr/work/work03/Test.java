package com.zcr.work.work03;

public class Test {
    public static void main(String[] args) {
        Manager manager = new Manager("manager", 1000, 25, 1.2);
        manager.setBonus(3000);
        manager.info();
        Worker worker = new Worker("worker", 500, 25, 1.0);
        worker.info();
    }
}
