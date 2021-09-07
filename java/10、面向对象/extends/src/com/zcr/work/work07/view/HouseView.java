package com.zcr.work.work07.view;

import com.zcr.work.work07.model.House;
import com.zcr.work.work07.service.HouseService;
import com.zcr.work.work07.utils.Utility;

public class HouseView {
    private boolean loop = true;
    private char key = ' ';
    private HouseService houseService = new HouseService(10);

    public void listHouse() {
        System.out.println("==========房屋列表========");
        System.out.println("编号\t\t房主\t\t电话\t\t地址\t\t月租\t\t状态\t\t");
        House[] houses = houseService.list();
        for (int i = 0; i < houses.length; i++) {
            if (houses[i] == null) {
                break;
            }
            System.out.println(houses[i]);
        }
        System.out.println("==========房屋列表显示完毕========");
    }

    public void delHouse() {
        System.out.println("==========删除房屋========");
        System.out.println("==========输入房屋编号========");
        int delId = Utility.readInt();
        if (delId == -1) {
            System.out.println("放弃删除");
            return;
        }
        char choice = Utility.readConfirmSelection();
        if (choice == 'Y') {
            if (houseService.del(delId)) {
                System.out.println("删除成功");
            } else {
                System.out.println("编号不存在");
            }
        } else {
            System.out.println("放弃删除");
        }
    }

    public void addHouse() {
        System.out.println("==========添加房屋========");
        System.out.println("姓名：");
        String name = Utility.readString(8);
        System.out.println("电话：");
        String phone = Utility.readString(12);
        System.out.println("地址：");
        String address = Utility.readString(16);
        System.out.println("租金：");
        int rent = Utility.readInt();
        System.out.println("状态：");
        String state = Utility.readString(3);
        House newHouse = new House(0, name, phone, address, rent, state);
        if (houseService.add(newHouse)) {
            System.out.println("添加成功");
        } else {
            System.out.println("添加失败");
        }
    }

    public void exitHouse() {
        char choice = Utility.readConfirmSelection();
        if (choice == 'Y') {
            loop = false;
        }
    }

    public void updateHouse() {
        System.out.println("==========修改房屋========");
        System.out.println("==========输入房屋编号(-1表示退出)========");
        int updateId = Utility.readInt();
        if (updateId == -1) {
            System.out.println("==========放弃修改房屋========");
            return;
        }
        House house = houseService.findById(updateId);
        if (house == null) {
            System.out.println("==========数据不存在========");
            return;
        }
        System.out.println("姓名(" + house.getName() + ")");
        String name = Utility.readString(8, "");//如果用户直接按回车，表示不修改，默认”“
        if (!"".equals(name)) {
            house.setName(name);
        }
    }

    public void findHouse() {
        System.out.println("==========查找房屋========");
        System.out.println("==========输入房屋编号========");
        int findId = Utility.readInt();
        House house = houseService.findById(findId);
        if (house != null) {
            System.out.println(house);
        } else {
            System.out.println("==========找不到========");
        }
    }

    public void mainMenu() {
        do {
            System.out.println("==========房屋出租系统========");
            System.out.println("\t\t\t1 新 增");
            System.out.println("\t\t\t2 查 找");
            System.out.println("\t\t\t3 删 除");
            System.out.println("\t\t\t4 修 改");
            System.out.println("\t\t\t5 列 表");
            System.out.println("\t\t\t6 退 出");
            System.out.print("请输入你的选择1-6");
            key = Utility.readChar();
            switch (key) {
                case '1':
                    addHouse();
                    break;
                case '2':
                    findHouse();
                    break;
                case '3':
                    delHouse();
                    break;
                case '4':
                    System.out.println("修改");
                    break;
                case '5':
                    listHouse();
                    break;
                case '6':
                    exitHouse();
                    break;
            }
        } while (loop);
    }
}
