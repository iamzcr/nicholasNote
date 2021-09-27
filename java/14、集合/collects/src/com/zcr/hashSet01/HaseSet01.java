package com.zcr.hashSet01;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HaseSet01 {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        //Set接口的实现类的对象(Set接口对象)，不能存放重复的运算
        //Set接口的实现类的对象(Set接口对象)，存放的数据是无序的，添加的顺序和取出的顺序不一致
        Set set = new HashSet();
        set.add("test");
        set.add("test1");
        set.add("test");
        set.add("test");
        set.add(null);
        set.add(null);
        set.remove(null);
        System.out.println(set);
        for (int i = 0; i < 10; i++) {
            //Set接口的实现类的对象(Set接口对象)，取出的顺序是固定的，也就是第一次取出的顺序和后面第n次的顺序是固定的，不管后面怎么添加
            System.out.println(set);
        }

        //遍历 迭代器
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            Object next = iterator.next();
            System.out.println(next);
        }
        //遍历，增强for循环
        for (Object o : set) {
            System.out.println(o);
        }
    }
}
