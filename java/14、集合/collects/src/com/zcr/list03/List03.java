package com.zcr.list03;

import java.util.*;

public class List03 {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        //list遍历
//        List list = new ArrayList();
//        List list = new Vector();
        List list = new LinkedList();
        list.add("test1");
        list.add("test2");
        list.add("test3");
        list.add("test4");
        System.out.println("增强for循环......");
        for (Object o : list) {
            System.out.println(o);
        }
        System.out.println("迭代器.......");
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object next = iterator.next();
            System.out.println(next);
        }
        System.out.println("for循环.......");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
