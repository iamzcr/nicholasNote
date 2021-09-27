package com.zcr.list05;

import java.util.ArrayList;
import java.util.Vector;

public class List05 {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        //创建了一个空的 this.elementData数组，可以追源码看看
        ArrayList list = new ArrayList();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        for (int i = 11; i < 15; i++) {
            list.add(i);
        }
        list.add(100);
        list.add(200);
        list.add(null);

        //指定大小的构造方法，也可以看源码
        ArrayList list1 = new ArrayList(10);
        //指定大小的构造方法，也可以看源码实现
        Vector vector = new Vector();
    }
}
