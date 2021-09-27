package com.zcr.innerClass05;
//匿名内部类
public class InnerClass05 {
    public static void main(String[] args) {
        Phone phone = new Phone();
        //匿名内部类重写了ring方法
        phone.alarmclock(new Bell() {
            @Override
            public void ring() {
                System.out.println("起床了");
            }
        });
        phone.alarmclock(new Bell() {
            @Override
            public void ring() {
                System.out.println("上课了");
            }
        });
    }


}


interface Bell {
    void ring();
}

class Phone {
    public void alarmclock(Bell bell) {
        bell.ring();//动态绑定
    }
}