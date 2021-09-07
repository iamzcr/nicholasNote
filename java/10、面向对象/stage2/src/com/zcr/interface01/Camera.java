package com.zcr.interface01;

public class Camera implements Usb {
    @Override
    public void start() {
        System.out.println("Camera start");
    }

    @Override
    public void stop() {
        System.out.println("Camera stop");
    }
}
