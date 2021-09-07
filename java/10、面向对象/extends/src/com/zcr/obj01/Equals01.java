package com.zcr.obj01;

public class Equals01 {
    public static void main(String[] args) {
        A a = new A();
        A b = a;
        A c = b;
        //==如果是判断引用类型，判断是地址是否相等
        System.out.println(a == c);
        System.out.println(b == c);

        B bObj = a;
        System.out.println(bObj == c);

        "hello".equals("abc");

        int num1 = 10;
        double num2 = 10.0;
        System.out.println(num1 == num2);

        Integer integer1 = new Integer(5);
        Integer integer2 = new Integer(5);

        System.out.println(integer2 == integer1);
        System.out.println(integer1.equals(integer2));

        String str1 = new String("1111");
        String str2 = new String("1111");

        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));
    }
}

class B {

}

class A extends B {

}
