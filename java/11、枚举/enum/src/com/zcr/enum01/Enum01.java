package com.zcr.enum01;

//定义枚举
public class Enum01 {
    public static void main(String[] args) {
        System.out.println(Season.AUTUMN);
    }
}

class Season {
    private String name;
    private String desc;
    //直接创建固定对象
    //使用final修饰，提高性能
    public final static Season SPRING = new Season("春天", "温暖");
    public final static Season WINTER = new Season("冬天", "寒冷");
    public final static Season AUTUMN = new Season("秋天", "凉爽");
    public final static Season SUMMER = new Season("夏天", "炎热");
    //构造方法私有化
    //去掉set方法
    private Season(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

    @Override
    public String toString() {
        return "Season{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}