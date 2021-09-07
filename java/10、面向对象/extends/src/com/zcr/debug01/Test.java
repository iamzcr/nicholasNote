package com.zcr.debug01;

public class Test {
    public static void main(String[] args) {
        int sum = 10;
        for (int i = 0; i < 5; i++) {
            sum += i;
            System.out.println("i=" + i);
            System.out.println("sum=" + sum);
        }
    }
}
