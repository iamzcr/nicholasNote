package com.zcr.main01;

public class Test {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println("第" + (i + 1) + "参数" + args[i]);
        }
    }
}
