package com.zcr.enum02;

//使用enum关键字实现枚举
public class Enum02 {
    public static void main(String[] args) {
        System.out.println(Season.SPRING);
        System.out.println(Season.WINTER);
        System.out.println(Season.AUTUMN);
        System.out.println(Season.SUMMER);
    }
}

//使用关键字enum替代class
//如果用enum类来实现枚举，要把常量对象写最前面
//有多个常量，用，后分隔
enum Season {

    SPRING("春天", "温暖"),
    WINTER("冬天", "寒冷"),
    AUTUMN("秋天", "凉爽"),
    SUMMER("夏天", "炎热");

    private String name;
    private String desc;

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