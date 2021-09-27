package com.zcr.string;

import java.util.Locale;

public class String03 {
    public static void main(String[] args) {
        //String常用方法
        //equals,indexOf,lastIndexOf,substring,trim,charAt,length,equalsIgnoreCase,trim,substring
        System.out.println("test".equalsIgnoreCase("tEST"));//不分大小写对比字符串
        System.out.println("test".equals("tEST"));//不分大小写对比字符串
        System.out.println("test".charAt(0));//取出单个字符
        System.out.println("iamzcr@gmail.com".indexOf("@"));//某个字符第一次出现的位置
        System.out.println("iamzcr@gmail.com@".lastIndexOf("@"));//某个字符最后一次出现的位置
        System.out.println("iamzcr@gmail.com@".substring(6));//某个字符最后一次出现的位置
        System.out.println("iamzcr@gmail.com@".substring(0, 6));//从0开始，截取到索引为5-1的位置
        System.out.println("iamzcr@gmail.com@ ".trim());//某个字符最后一次出现的位置
        System.out.println("iamzcr@gmail.com@".toUpperCase());//大写
        System.out.println("iamzcr@gmail.COM@".toLowerCase());//小写
        System.out.println("iamzcr".concat("@gmail.com"));//拼接
        System.out.println("zcriamzcr".replace("zcr", "@gmail.com"));//替换

        String[] strArr = "zcr@iam@zcr".split("@");
        for (int i = 0; i < strArr.length; i++) {
            System.out.println(strArr[i]);//分隔
        }

        char[] charsArr = "zcr@iam@zcr".toCharArray();
        for (int i = 0; i < charsArr.length; i++) {
            System.out.println(charsArr[i]);//分隔
        }
        System.out.println("iamzcr".compareTo("iamzaj"));//比较

        int age = 120;
        System.out.println(String.format("年龄=%d", age));

    }
}
