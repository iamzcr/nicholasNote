package com.zcr.instanceOf01;

public class Test {
    public static void main(String[] args) {
        Base base = new Sub();
        //instanceOf比较操作符，用于判断对象的运行类型是否为XX类型或者XX类型的子类型
        System.out.println(base instanceof Base);//ture
        System.out.println(base instanceof Sub);//ture
        Object obj = new Object();
        System.out.println(obj instanceof Base);//false
        String str = "";
        System.out.println(str instanceof Object);//ture

    }
}

class Base {
}

class Sub extends Base {
}
