package com.zcr.Iterator01;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Iterator01 {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        Collection col = new ArrayList();
        Book book = new Book("test", "zcr", 11.2);
        System.out.println(book);
        col.add(new Book("test", "zcr", 11.2));
        col.add(new Book("test1", "zcx", 11.2));
        col.add(new Book("test2", "zcj", 11.2));
        System.out.println(col);
        //得到该集合的迭代器
        Iterator iterator = col.iterator();
        while (iterator.hasNext()) {//判断是否还有数据
            Object next = iterator.next();//运行类型是本身存放的对象，编译类型是Object
            System.out.println("object=" + next);
        }
        //退出white循环之后，不能再iterator.next，不然会抛出一个异常
        //如果需要再次循环，需要重置迭代器
        iterator = col.iterator();
        while (iterator.hasNext()) {
            Object next = iterator.next();
            System.out.println("object=" + next);
        }


    }
}

class Book {
    private String name;
    private String author;
    private double price;

    public Book(String name, String author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }
}
