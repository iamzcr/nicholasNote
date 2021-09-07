package com.zcr.work.work04;

public class Test {
    public static void main(String[] args) {
//        CheckingAccount checkingAccount = new CheckingAccount(100);
//        checkingAccount.deposit(101);
//        System.out.println(checkingAccount.getBalance());
//        checkingAccount.withdraw(51);
//        System.out.println(checkingAccount.getBalance());
        SaveAccount saveAccount = new SaveAccount(1000);
        saveAccount.deposit(100);
        saveAccount.deposit(100);
        saveAccount.deposit(100);
        System.out.println(saveAccount.getBalance());
        saveAccount.deposit(100);
        System.out.println(saveAccount.getBalance());
        //月初，定时重置初始化配置
        saveAccount.earnMonthlyInterest();
        System.out.println(saveAccount.getBalance());
        saveAccount.withdraw(100);
        System.out.println(saveAccount.getBalance());

    }
}
