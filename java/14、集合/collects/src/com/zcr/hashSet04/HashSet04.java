package com.zcr.hashSet04;

import java.util.HashSet;

public class HashSet04 {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        /**
         * 创建了一个hashMap
         *  public HashSet() {
         *         map = new HashMap<>();
         *     }
         *     执行add
         *     public boolean add(E e) {
         *         return map.put(e, PRESENT)==null;PRESENT是hash的一个属性，类型为Object
         *     }
         *     执行put
         *     hash(key)得到一个hash值并不是一个真正的hashCode，而是(h = key.hashCode()) ^ (h >>> 16)
         *     public V put(K key, V value) {
         *         return putVal(hash(key), key, value, false, true);
         *     }
         *     执行putVal
         *         final V putVal(int hash, K key, V value, boolean onlyIfAbsent,
         *                    boolean evict) {
         *         Node<K,V>[] tab; Node<K,V> p; int n, i;//辅助变量
         *         table就是hashMap的同一个数组，类型是Node[]
         *         第一次扩容到16个
         *         if ((tab = table) == null || (n = tab.length) == 0)
         *             n = (tab = resize()).length;
         *         key根据计算出来的hash值，去计算该key应该存放到table表的哪个位置，并把位置赋值给p
         *         p如果为空，那么创建一个Node(key(java),value(PRESENT))节点，赋值给table的i这个位置
         *         if ((p = tab[i = (n - 1) & hash]) == null)
         *             tab[i] = newNode(hash, key, value, null);
         *         else {
         *             Node<K,V> e; K k;
         *             if (p.hash == hash &&
         *                 ((k = p.key) == key || (key != null && key.equals(k))))
         *                 e = p;
         *             else if (p instanceof TreeNode)
         *                 e = ((TreeNode<K,V>)p).putTreeVal(this, tab, hash, key, value);
         *             else {
         *                 for (int binCount = 0; ; ++binCount) {
         *                     if ((e = p.next) == null) {
         *                         p.next = newNode(hash, key, value, null);
         *                         if (binCount >= TREEIFY_THRESHOLD - 1) // -1 for 1st
         *                             treeifyBin(tab, hash);
         *                         break;
         *                     }
         *                     if (e.hash == hash &&
         *                         ((k = e.key) == key || (key != null && key.equals(k))))
         *                         break;
         *                     p = e;
         *                 }
         *             }
         *             if (e != null) { // existing mapping for key
         *                 V oldValue = e.value;
         *                 if (!onlyIfAbsent || oldValue == null)
         *                     e.value = value;
         *                 afterNodeAccess(e);
         *                 return oldValue;
         *             }
         *         }
         *         ++modCount;
         *         if (++size > threshold)
         *             resize();
         *
         *         afterNodeInsertion(evict);
         *         return null;
         *     }
         */
        HashSet hashSet = new HashSet();
        hashSet.add("java");
        hashSet.add("php");
        hashSet.add("java");
        System.out.println(hashSet);
    }
}
