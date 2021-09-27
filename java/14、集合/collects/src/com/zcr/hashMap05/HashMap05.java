package com.zcr.hashMap05;
//模拟树化,hashcode相同，equals返回flase

import java.util.HashMap;

@SuppressWarnings("all")
public class HashMap05 {
    public static void main(String[] args) {
        HashMap map = new HashMap();
        for (int i = 0; i < 13; i++) {
            map.put(new A(i), "hello");
        }
        System.out.println(map);
    }
}

class A {
    private int num;

    public A(int num) {
        this.num = num;
    }

    @Override
    public int hashCode() {
        return 100;
    }
}
