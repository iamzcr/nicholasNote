package com.zcr.final01;

public class Test {
}

//类不希望被继承时候，可以用final修饰
final class A {

}
//class B extends A{ }

class C {
    //不希望类的某个属性被修改，用final
    final public double PI = 3.14;

    //方法不希望被重写时候，可以用final修饰
    final public void test() {
    }
}

class D extends C {

}

class E {
    public void test() {
        //局部变量不希望被修改，用final
        final double PI = 3.14;
    }
}