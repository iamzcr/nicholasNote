package com.zcr.encap01;

public class AccountTest {
    public static void main(String[] args) {
        Account account = new Account("zcr","124256",50);
        System.out.println(account.getBalance());
        System.out.println(account.getName());
        System.out.println(account.getPwd());
        account.getInfo();
        //无参构造器设置属性
        Account account1 = new Account();
        account1.setName("zsj");
        account1.setPwd("123456");
        account1.setBalance(100);
        account1.getInfo();

    }
}
