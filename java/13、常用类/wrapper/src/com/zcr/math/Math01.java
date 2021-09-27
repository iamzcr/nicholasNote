package com.zcr.math;

public class Math01 {
    public static void main(String[] args) {
        System.out.println(Math.abs(-1));//绝对值
        System.out.println(Math.pow(2, 4));//2的4次方
        System.out.println(Math.max(2, 4));//两个数最大值
        System.out.println(Math.min(2, 4));//两个数最小值
        System.out.println(Math.ceil(30.9));//向上取整
        System.out.println(Math.floor(2.3));//向下取整
        System.out.println(Math.round(2.3));//四舍五入
        System.out.println(Math.sqrt(9));//开方
        for (int i = 0; i < 10; i++) {
            System.out.println(Math.random()); //返回[0-1)之间的一个随机小数
            System.out.println((int) (2 + Math.random() * (7 - 2 + 1))); //返回[0-1)之间的一个随机小数
        }

    }
}
