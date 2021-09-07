package com.zcr.interface01;

//Phone实现Usb接口，就必须把Usb的所有方法
public class Phone implements Usb {
    @Override
    public void start() {
        System.out.println("phone start");
    }

    @Override
    public void stop() {
        System.out.println("phone stop");
    }
}
