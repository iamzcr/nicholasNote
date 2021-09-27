package com.zcr.interface01;

public class Computer {
    //电脑提供一个方法，接口接进去
    //接受一个实现了Usb接口的类的对象实例
    public void work(Usb usb) {
        //通过接口调用方法
        usb.start();
        usb.stop();
    }
}
