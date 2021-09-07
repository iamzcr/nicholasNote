package com.zcr.work.work05;

public class Test {
    public static void main(String[] args) {
        Doctor doctor1 = new Doctor("test", 20, "test", "男", 2000);
        Doctor doctor2 = new Doctor("test", 20, "test", "男", 2000);
        System.out.println(doctor1.equals(doctor2));//判断属性是否相同
    }
}
