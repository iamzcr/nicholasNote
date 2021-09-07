package com.zcr.poly04;

public class Test {
    public static void main(String[] args) {
        Base base = new Sub();
        //属性没有重写的说法，属性的值看编译类型
        System.out.println(base.count);
        //类引用指向子类对象时，如果有方法重写就会有父类对象中方法的指针指向变化，否则没有。
        base.test(new String());
    }
}

class Base {
    int count = 10;

    public void test(String str) {
        System.out.println("base test");
    }
}

class Sub extends Base {
    int count = 20;

    public void test(Object obj) {
        System.out.println("sub test");
    }
}
