package com.zcr.work07;

public class Work07 {
    public static void main(String[] args) {
        Color green = Color.GREEN;
        green.show();
        System.out.println(green);
        switch (green) {
            case GREEN:
                System.out.println("绿色......");
                break;
            case YELLOW:
                System.out.println("黄色......");
                break;
            default:
                System.out.println("没匹配.......");
        }
    }

}
