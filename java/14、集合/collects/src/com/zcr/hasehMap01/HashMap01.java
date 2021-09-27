package com.zcr.hasehMap01;

import java.util.HashMap;
import java.util.Map;

public class HashMap01 {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("test", "zcr");
        map.put("test1", "zsj");
        map.put("test", "zcx");
        System.out.println(map);
        System.out.println(map.get("test"));
    }
}
