package com.zcr.enum06;

//enum实现接口
public class Enum06 {
    public static void main(String[] args) {
        Week.MONDAY.test();
    }
}

interface A {
    public void test();
}

enum Week implements A {
    MONDAY("星期一"),
    TUESDAY("星期二"),
    WENDESDAY("星期三"),
    THURSDAY("星期四"),
    FRIDAY("星期五"),
    SATURDAY("星期六"),
    SUMDAY("星期日");
    private String name;

    private Week(String name) {
        this.name = name;
    }

    public String getWeeks() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public void test() {
        System.out.println("enum可以实现接口......");
    }
}