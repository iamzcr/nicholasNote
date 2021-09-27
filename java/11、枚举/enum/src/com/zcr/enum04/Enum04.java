package com.zcr.enum04;

//enum的方法的使用
public class Enum04 {
    public static void main(String[] args) {
        //由于用enum创建的自定义枚举，默认继承java.lang.enum类，所以可以使用该类的所有方法
        Season season = Season.AUTUMN;
        //输出枚举名字
        System.out.println(season.name());
        //输出该枚举常量对象的次序，从0开始编号
        System.out.println(season.ordinal());
        //含有定义所有枚举的对象，返回一个数组
        Season values[] = season.values();
        for (Season seasonTmp : values) {//增强for循环，从values数组依次取值交给seasonTmp，没有了就退出
            System.out.println(seasonTmp);
        }
        //将字符串转成枚举对象，必须存在枚举中
        Season autumn = Season.valueOf("AUTUMN");
        System.out.println(autumn);
        System.out.println(autumn == season);
        //把AUTUMN这个枚举对象的编号和SUMMER这个枚举编号进行比较，如果等于0就表示相等
        System.out.println(Season.AUTUMN.compareTo(Season.SUMMER));
    }
}

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