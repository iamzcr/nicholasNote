package com.zcr.aList;

import java.util.ArrayList;
import java.util.List;

public class AList01 {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("test1");
        list.add("test2");
        list.add("test3");
        list.add(10);//本质是list.add(new Integer(10))，所以里面是对象
        list.add(true);
        System.out.println(list);
        list.remove(0);
        list.remove(new Integer(10));
        System.out.println(list);
        System.out.println(list.contains("test3"));
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        list.clear();
        list.add("test1");
        list.add("test2");
        list.add("test3");
        list.addAll(list);
        List list2 = new ArrayList();
        list2.add("test1");
        list2.add("test2");
        list2.add("test3");
        list.containsAll(list2);
        list.removeAll(list2);
        System.out.println(list);

    }
}
