package com.zcr.list04;

import java.util.*;

public class List04 {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        List arrayList = new ArrayList();
        arrayList.add(new Book("test1", "zcr", 1.2));
        arrayList.add(new Book("test2", "zcx", 1.6));
        arrayList.add(new Book("test3", "zsj", 1.3));
        System.out.println("排序后.......");
        for (Object o : arrayList) {
            System.out.println(o);
        }
        /*
        Collections.sort(arrayList, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Book book1 = (Book) o1;
                Book book2 = (Book) o2;
                if (book1.getPrice() > book2.getPrice()) {
                    return 1;
                } else {
                    return -1;
                }
            }
        });
         */
        bubble(arrayList);
        System.out.println("排序后.......");
        for (Object o : arrayList) {
            System.out.println(o);
        }
    }

    @SuppressWarnings("all")
    public static void bubble(List list) {
        int listSize = list.size();
        for (int i = 0; i < listSize - 1; i++) {
            for (int j = 0; j < listSize - 1 - i; j++) {
                Book b1 = (Book) list.get(j);
                Book b2 = (Book) list.get(j + 1);
                if (b1.getPrice() > b2.getPrice()) {
                    list.set(j, b2);
                    list.set(j + 1, b1);
                }
            }
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

