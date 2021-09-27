package com.zcr.enum05;

public class Enum05 {
    public static void main(String[] args) {
        Week week = Week.MONDAY;
        Week values[] = week.values();
        for (Week weekTmp : values) {
            System.out.println(weekTmp);
        }
    }
}

enum Week {
    MONDAY("星期一"),
    TUESDAY("星期二"),
    WENDESDAY("星期三"),
    THURSDAY("星期四"),
    FRIDAY("星期五"),
    SATURDAY("星期六"),
    SUMDAY("星期日");
    private String name;

    private Week(String name) {
        this.name = name;
    }

    public String getWeeks() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}