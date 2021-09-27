package com.zcr.innerClass03;
//匿名内部类
public class InnerClass03 {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.method();
    }
}

class Outer { //外部类
    private int n1 = 10;

    public void method() {
        //当我们想要使用A接口，并创建对象的时候，传统方式是写一个类，实现该接口，并创建对象
        A a = new B();
        a.cry();
        //当我们使用某个类只用一次，后面不在使用，那么定义B类就浪费，所有需要匿名内部类
        // 基于接口的匿名内部类
        // a1是编译类型，运行类型就是匿名内部类Outer$1
        /*底层会实现对应的接口，并且会立马创建Outer$1实例，并且把地址返回给a1，所以可以调用匿名内部类的cry方法
          匿名内部类使用一次就不能再使用
         class Outer$1 implements A {
                public void cry() {
                    System.out.println("cry........");
                }
          }
         */
        A a1 = new A() {
            @Override
            public void cry() {
                System.out.println("匿名内部类cry........");
            }
        };
        System.out.println("运行类型=" + a1.getClass());
        a1.cry();
        //基于类的匿名内部类
        //参数列表会传递给构造方法
        /*
         class Outer$2 extends Father {
           @Override
            public void test() {
                System.out.println("匿名内部类重写test方法........");
            }
         }
         */
        Father father = new Father("test") {
            private int n1 = 500;

            @Override
            public void test() {
                System.out.println("匿名内部类重写test方法........");
                System.out.println("就近原则访问n1=" + n1);
                System.out.println("访问外部的n1=" + Outer.this.n1);
            }
        };
        System.out.println("运行类型=" + father.getClass());
        //相当于底层生成了一个子类Outer$2去继承Father类，并重写了test方法
        father.test();
        //也可以这样使用，因为本身返回也是个对象
        new Father("test") {
            @Override
            public void test() {
                System.out.println("匿名内部类重写test方法........");
                System.out.println("访问外部类的私有属性n1=" + n1);
            }
        }.test();
        //带参数
        new Father("test") {
            @Override
            public void params(String str) {
                super.params(str);
            }
        }.params("zcr");
        //基于抽象类的匿名内部类
        Animal animal = new Animal() {
            @Override
            void eat() {
                System.out.println("抽象类的匿名内部类eat()......");
            }
        };
        System.out.println("运行类型=" + animal.getClass());
        animal.eat();
    }
}

interface A {//接口

    public void cry();
}

class B implements A {
    public void cry() {
        System.out.println("cry........");
    }
}

class Father {//类

    public Father(String name) {
        System.out.println("接受到了name=" + name);
    }

    public void test() {
        System.out.println("person test......");
    }

    public void params(String str) {
        System.out.println("person test......" + str);
    }
}

abstract class Animal {
    abstract void eat();
}