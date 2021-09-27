package com.zcr.bigInterger;

import java.math.BigDecimal;
import java.math.BigInteger;

public class BigInterger01 {
    public static void main(String[] args) {
        //bigInteger的类型不能用常规的算术运算符，要用该类的方法
        BigInteger bigInteger = new BigInteger("135555555555555555555555");
        System.out.println(bigInteger);
        BigInteger bigInteger2 = bigInteger.add(new BigInteger("1111"));
        System.out.println(bigInteger2);

        BigDecimal bigDecimal = new BigDecimal("135555555555555.22222222555555555");
        BigDecimal bigDecimal2 = new BigDecimal("3");
        System.out.println(bigDecimal);
        System.out.println(bigDecimal.add(bigDecimal2));
        System.out.println(bigDecimal.subtract(bigDecimal2));
        System.out.println(bigDecimal.multiply(bigDecimal2));
        //如果除不尽，可能会抛出异常，需要加精度
        System.out.println(bigDecimal.divide(bigDecimal2, BigDecimal.ROUND_CEILING));
    }
}
