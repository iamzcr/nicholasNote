package com.zcr.interface05;

//接口的多态数组
public class Interface05 {
    public static void main(String[] args) {
        Usb usb[] = new Usb[2];
        usb[0] = new Phone();
        usb[1] = new Commer();
        for (int i = 0; i < usb.length; i++) {
            usb[i].work();
            if (usb[i] instanceof Phone) {
                ((Phone) usb[i]).call();
            }
        }
    }
}

interface Usb {
    public void work();
}

class Phone implements Usb {
    public void work() {
        System.out.println("phone work.........");
    }

    public void call() {
        System.out.println("phone call.........");
    }
}

class Commer implements Usb {
    public void work() {
        System.out.println("commer work.........");
    }
}