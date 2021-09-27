package com.zcr.work04;

public class Test {
    public static void main(String[] args) {
        A a = new A();
        a.test();
    }
}

class A {
    private String name = "A";

    public void test() {
        class B {
            private String name = "B";

            public void show() {
                System.out.println("B的name=" + name);
                System.out.println("A的name=" + A.this.name);
            }
        }
        new B().show();
    }
}
