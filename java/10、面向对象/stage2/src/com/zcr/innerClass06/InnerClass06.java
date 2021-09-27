package com.zcr.innerClass06;

//成员内部类
public class InnerClass06 {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.test();
        //外部其他类访问成员内部类
        Outer.Inner inner = outer.new Inner();
        inner.say();
        //在外部类中编写方法，返回成员内部类的对象实例
        Outer.Inner inner2 = outer.getInner();
        inner2.say();
        //第三种方式
        Outer.Inner inner3 = new Outer().new Inner();
        inner3.say();
    }
}

class Outer {
    private int n1 = 10;
    private String name = "test";

    class Inner {//成员内部类
        private int n1 = 4000;

        public void say() {
            //可以直接访问外部类所有成员，包括私有
            System.out.println("n1=" + Outer.this.n1 + ";name=" + name);
            System.out.println("n1=" + n1 + ";name=" + name);
        }
    }

    public void test() {
        //调用成员内部类
        Inner inner = new Inner();
        inner.say();
        System.out.println(inner.n1);
    }

    public Inner getInner() {
        return new Inner();
    }
}