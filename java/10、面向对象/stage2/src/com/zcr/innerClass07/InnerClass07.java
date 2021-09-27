package com.zcr.innerClass07;

public class InnerClass07 {
    public static void main(String[] args) {
        Outer outer = new Outer();
        //outer.say();
        //外部其他类访问静态内部类
        Outer.Inner inner = new Outer.Inner();
        inner.test();
        //在外部类中编写方法，返回静态内部类的对象实例
        Outer.Inner inner2 = outer.getInner();
        //在外部类中编写静态方法，返回静态内部类的对象实例
        Outer.Inner inner3 = Outer.getStaticInner();
    }
}

class Outer {
    private int n1 = 10;
    private static String name = "test外部";

    static class Inner {
        private static String name = "test";

        public void test() {
            System.out.println("访问内部静态成员name=" + name);
            System.out.println("访问外部静态成员name=" + Outer.name);
        }
    }

    public void say() {//外部类访问静态内部类
        Inner inner = new Inner();
        inner.test();
    }

    public Inner getInner() {
        return new Inner();
    }

    public static Inner getStaticInner() {
        return new Inner();
    }
}
