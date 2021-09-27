package com.zcr.innerClass02;
//局部内部类
public class InnerClass02 {
    public static void main(String[] args) {
        Outer outer = new Outer();
        System.out.println("hashcode=" + outer);
        outer.m1();
    }
}

class Outer {
    //外部类属性
    private int n1 = 10;

    private void m2() {
        System.out.println("m2...........");
    }

    //内部类可以定义在代码块
    {
        class Inner2 {
            public void f1() {
                System.out.println("n1=" + n1);
                //局部内部类访问外部类成员（访问方式，直接访问）
                m2();
            }
        }
    }

    //外部类方法
    public void m1() {
        System.out.println("m1............");
        //内部类
        class Inner {
            private int n1 = 100;

            public void f1() {
                //如果外部类和内部局部类成员重名的时候，默认使用就近原则，如果想访问外部类的成员，外部类名.this.成员
                //谁调用了m1的方法，Outer.this就是对应的对象
                System.out.println("内部类的n1=" + n1);
                System.out.println("外部类的n1=" + Outer.this.n1);
                System.out.println("hashcode=" + Outer.this);
                m2();
            }
        }
        //外部类访问内部类成员（在方法中，创建对象，再访问，必须在作用域内）
        Inner inner = new Inner();
        inner.f1();
        //不能添加访问修饰符，因为他的地位就是一个局部变量，局部变量是不能使用修饰符，可以使用final，因为局部变量可以使用final
        final class Inner1 {
            public void f1() {
                System.out.println("n1=" + n1);
                m2();
            }
        }
    }

}