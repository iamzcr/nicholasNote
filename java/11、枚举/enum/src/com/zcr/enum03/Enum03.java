package com.zcr.enum03;

public class Enum03 {
    public static void main(String[] args) {
        Gender boy = Gender.BOY;
        Gender boy1 = Gender.BOY;
        //实质输出BOY这个对象的toSring方法
        System.out.println(boy);
        //BOY实质是static，所以boy和boy1实际只需同一个地址
        System.out.println(boy == boy1);
    }
}

enum Gender {
    BOY, GIRL;
}