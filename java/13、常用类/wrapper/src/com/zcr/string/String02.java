package com.zcr.string;

public class String02 {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "test";
        Person p2 = new Person();

        p2.name = "test";
        //p2.name和p1.name的name都是指向常量池里面test字符串的地址，所有地址是相等的，返回true
        System.out.println(p1.name.equals(p2.name));
        System.out.println(p1.name == p2.name);
        System.out.println(p1.name == "test");

        String s1 = new String("zcr");
        String s2 = new String("zcr");
        System.out.println(s1 == s2);

        //下面代码在常量池先创建了test对象，s3指向，然后又创建了一个zcr对象，s3重新指向该对象
        String s3 = "test";
        s3 = "zcr";
        //下面代码只创建一个对象，因为编译器不是傻子，会判断字符串是否有引用指向
        String s4 = "test" + "zcr";
        //下面代码创建两个常量池对象，test对象，zcr对象
        String a = "test";
        String b = "zcr";
        //String c = a + b 先创建一个StringBuilder，sb = new StringBuilder(),
        // 然后sb.append(test),
        // 继续追加sb.append(zcr)
        // 执行StringBuilder的toString方法
        //最后c指向堆中的String的value[]->常量池中的testzcr
        String c = a + b;

    }
}

class Person {
    public String name;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }
}
