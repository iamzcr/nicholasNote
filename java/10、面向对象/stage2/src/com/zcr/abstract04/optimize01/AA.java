package com.zcr.abstract04.optimize01;

public class AA extends Template {
    public void job() {
        long num = 0;
        for (long i = 0; i < 800000; i++) {
            num += i;
        }
    }
}
