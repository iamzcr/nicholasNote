//map常用方法
package com.zcr.hashMap03;

import java.util.HashMap;
import java.util.Map;

public class HashMap03 {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        Map map = new HashMap();

        map.put("test", new Book("book", 12));
        map.put("test1", "test");
        map.put(null, "test222");
        map.put("test2", null);
        System.out.println(map);
        System.out.println(map.get("test1"));
        System.out.println(map.size());
        System.out.println(map.isEmpty());
        System.out.println(map.remove("test"));
        map.clear();
        System.out.println(map.containsKey("test2"));
    }
}

class Book {
    private String name;
    private int num;

    public Book(String name, int num) {
        this.name = name;
        this.num = num;
    }
}
