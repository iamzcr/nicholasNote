package com.zcr.hashSet03;

public class HashSet03 {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        //模拟一个haseSet底层
        //有些人把 Node[]数组称为表
        Node[] table = new Node[16];
        Node john = new Node("john", null);
        table[2] = john;
        Node jack = new Node("jack", null);
        john.next = jack; //jack节点挂载到john
        Node rose = new Node("rose", null);
        jack.next = rose; //rose节点挂载到rose

        Node luck = new Node("luck", null);
        table[3] = luck;
        System.out.println(table);
    }
}

class Node {
    Object item;
    Node next;

    public Node(Object item, Node next) {
        this.item = item;
        this.next = next;
    }

    @Override
    public String toString() {
        return "Node{" +
                "item=" + item +
                ", next=" + next +
                '}';
    }
}