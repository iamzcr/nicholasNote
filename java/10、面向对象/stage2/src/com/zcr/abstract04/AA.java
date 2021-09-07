package com.zcr.abstract04;

public class AA {
    public void job() {
        long start = System.currentTimeMillis();
        long num = 0;
        for (long i = 0; i < 800000; i++) {
            num += i;
        }
        long end = System.currentTimeMillis();
        System.out.println("AA执行时间：" + (end - start));
    }
}
