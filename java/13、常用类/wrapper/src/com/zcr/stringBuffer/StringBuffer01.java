package com.zcr.stringBuffer;

public class StringBuffer01 {
    public static void main(String[] args) {
        //StringBuffer是可变长度的，很多方法都和String一样,
        //继承了AbstractStringBuilder，AbstractStringBuilder里面char[] value 不是final，存放字符序列，所以内容在堆中，不在常量池
        StringBuffer stringBuffer = new StringBuffer();
        //构造方法构建一个存放60个字符的stringBuffer对象，默认是16个字符
        StringBuffer stringBuffer1 = new StringBuffer(60);
        StringBuffer stringBuffer2 = new StringBuffer("hello");

        //StringBuffer和String的相互转换
        //String=>StringBuffer
        String str = "hello";
        StringBuffer stringBuffer3 = new StringBuffer(str);
        StringBuffer stringBuffer4 = stringBuffer3.append(str);
        //StringBuffer=>String
        StringBuffer stringBuffer5 = new StringBuffer("zcr");
        String str1 = stringBuffer5.toString();
        String str2 = new String(stringBuffer5);

        StringBuffer sb = new StringBuffer("hello");
        System.out.println(sb);
        sb.append("zcr");
        System.out.println(sb);
        sb.delete(2,4);
        System.out.println(sb);
        sb.replace(2,4,"test");
        System.out.println(sb);
        int index = sb.indexOf("t");
        System.out.println(index);
        sb.insert(2,"test");
        System.out.println(sb);
    }
}
