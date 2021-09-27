package com.zcr.wrapper01;

import java.math.BigInteger;

public class Test1 {
    public static void main(String[] args) {
        System.out.println(Integer.MAX_VALUE);
        //包装类(Integer)-》String
        Integer i = 100;

        //方法1
        String str = i + "";
        //方法2
        String str1 = i.toString();
        //方法三
        String str2 = String.valueOf(i);

        //包装类(String)-》Integer
        Integer integer = Integer.parseInt(str);
        Integer integer2 = new Integer(str);



    }
}

