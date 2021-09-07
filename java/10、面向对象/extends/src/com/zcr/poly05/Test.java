//java的动态绑定机制(非常非常重要)
package com.zcr.poly05;

public class Test {
    public static void main(String[] args) {
        Base base = new Sub();
        System.out.println(base.sum());
        System.out.println(base.sum1());
    }
}
