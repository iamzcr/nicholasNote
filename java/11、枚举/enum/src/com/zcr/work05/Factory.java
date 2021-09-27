package com.zcr.work05;

public class Factory {
    //马只有一匹，所以饿汉式提供单例
    private static Horse horse = new Horse();

    private Factory() {
    }

    public static Horse getHorseInstance() {
        return horse;
    }

    //这里只需要获取一个对象，所以静态方法获取即可，没必要创建Factory对象
    public static Boat getBoatInstance() {
        return new Boat();
    }
}
