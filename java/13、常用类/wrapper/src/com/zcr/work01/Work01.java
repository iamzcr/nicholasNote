package com.zcr.work01;

import java.util.Arrays;
import java.util.Comparator;

public class Work01 {
    public static void main(String[] args) {
        Book[] books = new Book[5];
        books[0] = new Book("test1", 102);
        books[1] = new Book("test2", 12);
        books[2] = new Book("test3", 22);
        books[3] = new Book("test4", 99);
        books[4] = new Book("test5", 88);

        //按价格排序
        /*
        Arrays.sort(books, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Book b1 = (Book) o1;
                Book b2 = (Book) o2;
                double price = b1.getPrice() - b2.getPrice();
                if (price > 0) {
                    return 1;
                } else if (price < 0) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });
         */
        Arrays.sort(books, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Book b1 = (Book) o1;
                Book b2 = (Book) o2;
                return b1.getName().length() - b2.getName().length();
            }
        });
        System.out.println(Arrays.toString(books));
    }

}

class Book {
    private String name;
    private double price;

    public Book(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
