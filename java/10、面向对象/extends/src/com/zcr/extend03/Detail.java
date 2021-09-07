package com.zcr.extend03;

public class Detail {
    public static void main(String[] args) {
        //先按顺序加载object，GrandPa，Father，Son类信息到方法区
        Son son = new Son();
        //如果子类有这个属性，并且可以访问，则返回信息
        //如果子类没有这个属性，看父类，依次逐级查找
        System.out.println(son.name);
    }
}
class GrandPa{
    String name = "大头爷爷";
    String hobby = "旅游";
}
class Father extends  GrandPa{
    String name = "大头爸爸";
    int age = 39;
}
class Son extends  Father{
    String name = "大头";
}