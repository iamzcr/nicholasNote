package com.zcr.hashSet05;

import java.util.HashSet;

public class HashSet05 {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
        for (int i = 1; i < 100; i++) {
            hashSet.add(i);
        }
        //链表红黑树化，hashCode相同，值不同，放在同一个链表上
        for (int i = 1; i <= 12; i++) {
            hashSet.add(new A(i));
        }
    }
}

class A {
    private int i;

    public A(int i) {
        this.i = i;
    }

    @Override
    public int hashCode() {
        return 100;
    }

}
