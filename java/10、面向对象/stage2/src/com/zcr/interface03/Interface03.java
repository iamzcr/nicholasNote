package com.zcr.interface03;

public class Interface03 {
    public static void main(String[] args) {

    }
}

interface AA {
    int n1 = 10;//等价于public static final int a = 0

    public void test();
}

interface BB {
    public void test1();
}

interface DD extends AA, BB {

}
//一个类同时可以实现多个接口
class EE implements DD {
    @Override
    public void test() {

    }

    @Override
    public void test1() {

    }
}
//一个类同时可以实现多个接口
class CC implements AA, BB {
    @Override
    public void test() {

    }

    @Override
    public void test1() {

    }
}