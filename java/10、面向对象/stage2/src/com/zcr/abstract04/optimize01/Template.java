package com.zcr.abstract04.optimize01;

abstract public class Template {
    abstract public void job();

    public void cuteTime() {
        long start = System.currentTimeMillis();
        job();//动态绑定机制
        long end = System.currentTimeMillis();
        System.out.println("执行时间：" + (end - start));
    }
}
