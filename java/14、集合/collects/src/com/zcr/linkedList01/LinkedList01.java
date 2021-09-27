package com.zcr.linkedList01;


import java.util.LinkedList;

public class LinkedList01 {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(1);

        //模拟双向链表
        Node jack = new Node("jack");
        Node tom = new Node("tom");
        Node zcr = new Node("zcr");
        //jack->tom->zcr
        jack.next = tom;
        tom.next = zcr;
        //zcr->tom->jack
        zcr.pre = tom;
        tom.pre = jack;

        Node first = jack;
        Node last = zcr;


        while (true) {
            if (first == null) {
                break;
            }
            System.out.println(first);
            first = first.next;
        }
        while (true) {
            if (last == null) {
                break;
            }
            System.out.println(last);
            last = last.pre;
        }


        //双向链表中添加一个数据，在tom和zcr之间
        Node test = new Node("test");
        test.next = zcr;
        test.pre = tom;
        tom.next = test;
        zcr.pre = test;

        first = jack;
        last = zcr;

        while (true) {
            if (first == null) {
                break;
            }
            System.out.println(first);
            first = first.next;
        }
    }
}

class Node {
    public Object item;
    public Node next;
    public Node pre;

    public Node(Object item) {
        this.item = item;
    }

    @Override
    public String toString() {
        return "Node name=" + item;
    }
}