//map遍历
package com.zcr.hashMap04;

import java.util.*;

public class HashMap04 {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        Map map = new HashMap();

        map.put("test", new Book("book", 12));
        map.put("test1", "test");
        map.put(null, "test222");
        map.put("test2", null);
        Set keySet = map.keySet();
        //增强for循环
        for (Object key : keySet) {
            System.out.println(key + "....." + map.get(key));
        }
        //迭代器
        Iterator iterator = keySet.iterator();
        while (iterator.hasNext()) {
            Object key = iterator.next();
            System.out.println(key + "....." + map.get(key));
        }

        //Collection类型的遍历，拿出value
        Collection values = map.values();
        for (Object value : values) {
            System.out.println(value);
        }
        //迭代器
        Iterator iterator1 = values.iterator();
        while (iterator1.hasNext()) {
            Object value = iterator1.next();
            System.out.println(value);
        }

        //通过entrySet循环拿出来entrySet取出来放的就是一个entry
        Set entrySet = map.entrySet();
        for (Object entry : entrySet) {
            System.out.println(entry.getClass());
            //entry转成Map.Entry
            Map.Entry obj = (Map.Entry) entry;
            System.out.println(obj.getKey() + "000" + obj.getValue());
        }
        //迭代器取出entrySet
        Iterator iterator2 = entrySet.iterator();
        while (iterator2.hasNext()) {
            Object next =  iterator2.next();
            System.out.println(next.getClass());
            Map.Entry obj = (Map.Entry) next;//向下转型
            System.out.println(obj.getKey() + "000" + obj.getValue());
        }
    }
}

class Book {
    private String name;
    private int num;

    public Book(String name, int num) {
        this.name = name;
        this.num = num;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", num=" + num +
                '}';
    }
}