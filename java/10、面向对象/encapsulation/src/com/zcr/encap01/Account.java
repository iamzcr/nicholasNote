package com.zcr.encap01;

public class Account {
    private String name;
    private String pwd;
    private double balance;

    public Account() {
    }

    public Account(String name, String pwd, double balance) {
        setName(name);
        setPwd(pwd);
        setBalance(balance);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() >= 2 && name.length() <= 4) {
            this.name = name;
        } else {
            System.out.println("姓名设置不正确");
            this.pwd = "无名";
        }
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        if (pwd.length() == 6) {
            this.pwd = pwd;
        } else {
            System.out.println("密码必须是6位");
            this.pwd = "123456";
        }
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (balance > 20) {
            this.balance = balance;
        } else {
            System.out.println("余额必须大于20");
            this.balance = 20;
        }
    }

    public void getInfo() {
        System.out.println("姓名:" + name + ";密码:" + pwd + "余额;" + balance);
    }
}
