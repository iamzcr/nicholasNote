package com.zcr.work05;

public class Person {
    private String name;
    private Vehicles vehicles;

    //创建人对象时，事先分配了交通工具
    public Person(String name, Vehicles vehicles) {
        this.name = name;
        this.vehicles = vehicles;
    }
    //得到船
    public void passRiver() {
        if(!(vehicles instanceof Boat)){
            vehicles = Factory.getBoatInstance();
        }
        vehicles.work();
    }
    //得到马儿
    public void common() {
        if(!(vehicles instanceof Horse)){
            vehicles = Factory.getHorseInstance();
        }
        vehicles.work();
    }
}
