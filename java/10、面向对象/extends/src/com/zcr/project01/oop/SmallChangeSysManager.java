package com.zcr.project01.oop;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SmallChangeSysManager {
    boolean loop = true;
    Scanner scanner = new Scanner(System.in);
    String key = "";
    String note = "";
    double money = 0;
    double balance = 0;
    Date date = null;
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
    String detail = "============零钱明细============";

    public void mainMenu() {
        do {
            System.out.println("============菜单============");
            System.out.println("\t\t\t1 零钱明细");
            System.out.println("\t\t\t2 收入");
            System.out.println("\t\t\t3 消费");
            System.out.println("\t\t\t4 退出");
            System.out.println("请选择1-4：");
            key = scanner.next();
            switch (key) {
                case "1":
                    this.detail();
                    break;
                case "2":
                    this.income();
                    break;
                case "3":
                    this.pay();
                    break;
                case "4":
                    this.exit();
                    break;
                default:
                    System.out.println("选择有误，重新选择");
                    break;
            }
        } while (loop);
    }

    public void detail() {
        System.out.println(detail);
    }

    public void income() {
        System.out.println("输入收入金额：");
        money = scanner.nextDouble();
        if (money <= 0) {
            System.out.println("金额不正确");
            return;
        }
        balance += money;
        date = new Date();
        detail += "\n收入\t+" + money + "\t" + sdf.format(date) + "\t" + balance;
        return;
    }

    public void pay() {
        System.out.println("输入消费金额：");
        money = scanner.nextDouble();
        if (money <= 0 || money > balance) {
            System.out.println("金额不正确");
            return;
        }
        System.out.println("输入消费途径：");
        note = scanner.next();

        balance -= money;
        date = new Date();
        detail += "\n" + note + "\t-" + money + "\t" + sdf.format(date) + "\t" + balance;
        return;
    }

    public void exit() {
        System.out.println("退出");
        String choice = "";
        while (true) {
            System.out.println("你确定要退出吗？ y/n");
            choice = scanner.next();
            if ("y".equals(choice) || "n".equals(choice)) {
                break;
            }
        }
        if (choice.equals("y")) {
            loop = false;
        }
        return;
    }
}
