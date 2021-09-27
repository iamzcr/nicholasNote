package com.zcr.for01;

import java.util.ArrayList;
import java.util.Collection;

public class For01 {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        Collection col = new ArrayList();
        Book book = new Book("test", "zcr", 11.2);
        System.out.println(book);
        col.add(new Book("test", "zcr", 11.2));
        col.add(new Book("test1", "zcx", 11.2));
        col.add(new Book("test2", "zcj", 11.2));
        System.out.println(col);
        for (Object obj : col) {
            System.out.println(book);
        }
        int[] nums = {1, 2, 30};
        for (int i : nums) {
            System.out.println(i);
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
