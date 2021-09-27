package com.zcr.list02;

import java.util.ArrayList;
import java.util.List;

public class List01 {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("test1");
        list.add("test2");
        list.add("test3");
        list.add("test4");
        list.add(1, "test5");
        System.out.println(list);
        System.out.println(list.get(2));

        List list2 = new ArrayList();
        list2.add("test1111");
        list2.add("test2222");
        list2.add("test3333");
        list2.add("test1111");

        list.addAll(1, list2);//在某个索引加入list
        System.out.println(list);
        System.out.println(list.indexOf("test1111"));
        System.out.println(list.lastIndexOf("test1111"));
        list.remove(0);//删除为0的索引
        list.set(0, "zcr");//设置第0个索引为zcr
        System.out.println(list.subList(0, 2));//截取一个list
    }
}
