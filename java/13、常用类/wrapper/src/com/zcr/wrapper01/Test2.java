package com.zcr.wrapper01;

public class Test2 {
    public static void main(String[] args) {
        //两个不同对象
        Integer a = new Integer(1);
        Integer b = new Integer(1);

        //实际跑这个方法Integer.valueOf(1);如果范围在-128-127，不创建对象，返回缓存，所以返回true
        Integer n = 1;
        Integer m = 1;

        System.out.println(n == m);
        //实际跑这个方法Integer.valueOf(1);如果范围在-128-127，不创建对象，返回缓存，所以返回true
        Integer x = 128;
        Integer y = 128;
        System.out.println(x == y);

    }
}
