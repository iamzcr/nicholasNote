package com.zcr.obj01;

public class Finalize01 {
    public static void main(String[] args) {
        Car test = new Car("test");
        //此时，car对象就是个垃圾，垃圾回收器就会回收(销毁)对象,在回收对象前，就会调用finalize，程序员可以重写该方法，写自己逻辑代码，比如释放数据库，文件资源
        //如果不重写，就会调用object类的finalize方法，默认处理
        //不会立马回收，通过垃圾回收算法回收可以通过System.gc()主动触发
        test = null;
        System.gc();
        System.out.println("程序退出.....");

    }
}

class Car {
    private String name;

    public Car(String name) {
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {//实际开发中基本不用
        super.finalize();
        System.out.println("垃圾回收");
    }
}
