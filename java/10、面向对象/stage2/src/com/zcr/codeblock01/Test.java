package com.zcr.codeblock01;

public class Test {
    public static void main(String[] args) {
        //普通代码块，每创建一个对象，就执行
        Movie movie = new Movie("test");
        Movie movie1 = new Movie("test", 1111);

        //static代码块作用就是对类进行初始化，而且他随着类的加载而执行，并且只会执行一次
        //类是什么时候加载的：
        //创建对象实例时(new)
        //创建子类对象实例，父类也会被加载
        //使用类的静态成员(方法和属性)
        Demo demo = new Demo();
        System.out.println(Demo.name);
        Demo.test();
    }
}

class Demo {
    public static String name;

    static {
        System.out.println("Demo的static代码块..");
    }

    public static void test() {
        System.out.println("demo test");
    }
}

class Movie {
    private String name;
    private double price;
    private String director;

    //三个构造方法，重载
    //代码比较冗余，把相同的放在代码块里面
    //代码块的顺序优先于构造方法
    {
        System.out.println("电影屏幕打开..");
        System.out.println("广告.......");
        System.out.println("电影开始.......");
    }

    public Movie(String name) {
        /*
            System.out.println("电影屏幕打开..");
            System.out.println("广告.......");
            System.out.println("电影开始.......");
        */
        System.out.println("Movie(String name)");
        this.name = name;
    }

    public Movie(String name, double price) {
        /*
            System.out.println("电影屏幕打开..");
            System.out.println("广告.......");
            System.out.println("电影开始.......");
         */
        System.out.println("Movie(String name, double price)");
        this.name = name;
        this.price = price;
    }

    public Movie(String name, double price, String director) {
        /*
            System.out.println("电影屏幕打开..");
            System.out.println("广告.......");
            System.out.println("电影开始.......");
         */
        this.name = name;
        this.price = price;
        this.director = director;
    }
}
