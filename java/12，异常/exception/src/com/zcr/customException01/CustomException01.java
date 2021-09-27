package com.zcr.customException01;

//自定义异常
public class CustomException01 {
    public static void main(String[] args) {
//        test();
        try {
            test1();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            test2();
        }

    }

    public static void test() {
        int age = 180;
        if (!(age >= 18 && age <= 120)) {
            throw new AgeException("年龄不对.....");
        }
        System.out.println("年龄正确......");
    }

    public static void test1() {
        try {
            System.out.println("test1");
            //抛出异常，给main放try-catch捕获
            throw new RuntimeException("RuntimeException test1.....");
        } finally {
            System.out.println("test1 finally");
        }
    }

    public static void test2() {
        try {
            System.out.println("test2");
            //这里即使return了，也必须执行完finally才return
            return;
        } finally {
            System.out.println("test2 finally");
        }
    }
}

class AgeException extends RuntimeException {
    public AgeException(String msg) {
        super(msg);
    }
}