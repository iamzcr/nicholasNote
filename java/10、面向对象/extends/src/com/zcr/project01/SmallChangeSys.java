package com.zcr.project01;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SmallChangeSys {
    public static void main(String[] args) {
        boolean loop = true;
        Scanner scanner = new Scanner(System.in);
        String key = "";
        String note = "";
        double money = 0;
        double balance = 0;
        Date date = null;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        String detail = "============零钱明细============";
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
                    System.out.println(detail);
                    break;
                case "2":
                    System.out.println("输入收入金额：");
                    money = scanner.nextDouble();
                    if (money <= 0) {
                        System.out.println("金额不正确");
                        break;
                    }
                    balance += money;
                    date = new Date();
                    detail += "\n收入\t+" + money + "\t" + sdf.format(date) + "\t" + balance;
                    break;
                case "3":
                    System.out.println("输入消费金额：");
                    money = scanner.nextDouble();
                    if (money <= 0 || money > balance) {
                        System.out.println("金额不正确");
                        break;
                    }
                    System.out.println("输入消费途径：");
                    note = scanner.next();

                    balance -= money;
                    date = new Date();
                    detail += "\n" + note + "\t-" + money + "\t" + sdf.format(date) + "\t" + balance;
                    break;
                case "4":
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
                    break;
                default:
                    System.out.println("选择有误，重新选择");
                    break;
            }
        } while (loop);

        System.out.println("退出应用");
    }
}
