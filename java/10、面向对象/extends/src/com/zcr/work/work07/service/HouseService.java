package com.zcr.work.work07.service;

import com.zcr.work.work07.model.House;

public class HouseService {
    private House[] houses;
    private int houseNums = 1;//数组元素数量
    private int idCounter = 1; //编号自增

    //构造方法，创建对象的时候指定存放大小
    public HouseService(int size) {
        houses = new House[size];
        houses[0] = new House(1, "jack", "15820258681", "test", 1000, "未出租");
    }

    public boolean add(House newHouse) {
        if (houseNums == houses.length) {//数组可以扩容
            System.out.println("不能添加，超过容量");
            return false;
        }
        houses[houseNums] = newHouse;
        houseNums++;
        idCounter++;
        newHouse.setId(idCounter);
        return true;
    }

    public House findById(int findId) {
        for (int i = 0; i < houseNums; i++) {
            if (findId == houses[i].getId()) {
                return houses[i];
            }
        }
        return null;
    }

    public boolean del(int delId) {
        int index = -1;
        for (int i = 0; i < houseNums; i++) {
            if (delId == houses[i].getId()) {
                index = i;
            }
        }
        if (index == -1) {
            return false;
        }
        //移动方式删除
        for (int i = index; i < houseNums - 1; i++) {
            houses[i] = houses[i + 1];
        }
        houses[houseNums - 1] = null;
        houseNums--;
        return true;
    }

    public House[] list() {
        return houses;
    }
}
