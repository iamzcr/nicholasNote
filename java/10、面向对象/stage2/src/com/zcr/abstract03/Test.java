package com.zcr.abstract03;

public class Test {
    public static void main(String[] args) {
        Manager manager = new Manager("test", 9999, 99999);
        manager.setBonus(8000);
        manager.work();
    }
}
