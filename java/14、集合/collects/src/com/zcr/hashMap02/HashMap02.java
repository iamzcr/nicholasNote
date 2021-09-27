package com.zcr.hashMap02;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMap02 {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("test", "zcr");//k-v
        map.put("test1", "zsj");
        map.put(new Car(), new Person());
        //k-v,最后是HashMap$Node node = newNode(hash,key,value,null)
        //k-v,为了方便遍历，还会创建EntrySet集合，该集合存放的元素类型Entry，
        //而一个Entry对象就有K,V，在EntrySet存放，EntrySet<Entry<K,V>>
        //EntrySet<Entry<K,V>>K,V只是一个指向，newNode(hash,key,value,null)中的key和value
        //EntrySet定义的是map.Entry，但是实际上还是HashMap$Node，因为HashMap$Node实现了Entry接口
        //HashMap$Node就是为了方便遍历，因为存放了两个方法getKey()和getValue()


        Set set = map.entrySet();
        System.out.println(set.getClass());
        for (Object obj : set) {
            System.out.println(obj.getClass());
            //做一个向下转型
            Map.Entry entry = (Map.Entry) obj;
            System.out.println(entry.getKey());
        }
    }
}

class Car {

}

class Person {

}
