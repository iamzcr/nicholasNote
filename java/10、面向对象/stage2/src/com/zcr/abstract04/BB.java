package com.zcr.abstract04;

public class BB {
    public void job() {
        long start = System.currentTimeMillis();
        long num = 0;
        for (long i = 0; i < 800000; i++) {
            num *= i;
        }
        long end = System.currentTimeMillis();
        System.out.println("BB执行时间：" + (end - start));
    }
}
