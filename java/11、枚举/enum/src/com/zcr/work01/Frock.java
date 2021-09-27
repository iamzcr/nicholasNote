package com.zcr.work01;

public class Frock {
    private int serialNumber;
    private static int currentNum = 100000;

    public static int getNextNum() {
        return currentNum += 100;
    }

    public Frock() {
        serialNumber = getNextNum();
    }

    public int getSerialNumber() {
        return serialNumber;
    }
}
