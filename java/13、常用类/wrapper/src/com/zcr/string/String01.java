package com.zcr.string;

public class String01 {
    public static void main(String[] args) {
        //String对象用于保存字符串，也就是一组字符串序列
        //test就是字符串常量，用“”括起来
        //字符串的字符使用Unicode字符编码，一个字符(不区分字母，还是汉字)占用两个字节
        //String有很多的构造方法,例如：
        // new String(),new String(char[] a),new String(byte[] a)等等
        //String 可以串行化，可以再网络传输，因为实现了序列化接口
        //String 可以比较大小，因为实现了Comparable
        //赋值创建：从常量池查看是否有字符串（test）数据空间，如果有，直接指向，如果没有则重新创建，然后指向，最终指向的是常量池的空间地址
        String name = "test";
        //构造方法方式：先在堆中创建空间，里面维护了value属性，指向常量池的字符串（test）数据空间，
        // 如果常量池没有该字符串（test），重新创建，如果有则通过value指向，最终指向的是堆中的空间地址
        String name1 = new String("test");

        //name1.intern()返回的是test在常量池的地址
        System.out.println(name == name1.intern());
        System.out.println(name1 == name1.intern());
    }
}
