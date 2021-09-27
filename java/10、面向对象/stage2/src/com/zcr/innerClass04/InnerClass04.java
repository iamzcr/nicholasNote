package com.zcr.innerClass04;

//匿名内部类最佳实践
public class InnerClass04 {
    public static void main(String[] args) {
        //匿名内部类传递写法
        f1(new AA() {
            @Override
            public void show() {
                System.out.println("AA show");
            }
        });
        //传统写法
        f1(new BB());
    }

    public static void f1(AA aa) {
        System.out.println("hashcode = " + aa);
        aa.show();
    }
}

interface AA {

    void show();
}

//硬编码
class BB implements AA {
    @Override
    public void show() {
        System.out.println("传统写法 show");
    }
}
