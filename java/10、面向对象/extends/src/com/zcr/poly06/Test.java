package com.zcr.poly06;

public class Test {
    public static void main(String[] args) {
        //base是和运行类型sub绑定的
        Base base = new Sub();
        //按照您的说法，这里输出的应该sub下面的test方法，也就是输出sub test，但是实际上输出的却是base test，这是为什么呢？
        //按我的理解应该是看子类有没有重写父类的方法决定的，如果重写了，那么就调用子类的， 没重写就调用父类的。
        //你案例中getI(),调用了子类的，应该是重写了父类的getI()，方法的原因吧
        base.test(new String());
    }
}

class Base {
    public void test(String str) {
        System.out.println("base test");
    }
}

class Sub extends Base {
    public void test(Object obj) {
        System.out.println("sub test");
    }
}
