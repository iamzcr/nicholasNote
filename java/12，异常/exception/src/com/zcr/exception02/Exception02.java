package com.zcr.exception02;

import java.util.Scanner;

public class Exception02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        while (true) {
            System.out.println("输入一个整数");

            try {
                //这里可能抛出异常
                num = Integer.parseInt(scanner.next());
                break;
            } catch (NumberFormatException e) {
                System.out.println("输入的不是一个整数");
            }
        }
        System.out.println("输入的值是：" + num);
    }
}
