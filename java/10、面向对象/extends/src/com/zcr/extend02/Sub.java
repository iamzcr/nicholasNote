package com.zcr.extend02;

public class Sub extends Base {
    public Sub() {//无参构造方法
        //super();隐藏了super()方法，用来调用父类默认无参构造方法
        //显式调用指定父类构造方法
        super("zcr",20);
        System.out.println("Sub()......");
    }

    public Sub(String name) {
        //如果父类没有提供无参构造方法，则必须在子类的构造方法中使用super()去指定使用父类的哪个构造方法去完成的对父类的初始化工作，否则，编译不通过
        super("zcr",20);
        System.out.println("Sub(String name)......");
    }

    public void sayOk() {
        //私有属性和方法不能在子类直接访问
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
        //通过父类提供公共方法去访问
        System.out.println(getN4());
        //私有属性和方法不能在子类直接访问
        //System.out.println(n4);
        test100();
        test200();
        test300();
        //私有属性和方法不能在子类直接访问
        //test400()
        //通过父类提供公共方法去访问
        callTest400();
    }
}
