package com.zcr.single01;

public class Single01 {
    public static void main(String[] args) {
        Mysql mysql = Mysql.getInstance();
        System.out.println(mysql);
        //虽然多次调用，但是由于 Mysql.getInstance返回的是静态属性，所以实际上指向的是同一个东西
        Mysql mysql2 = Mysql.getInstance();
        System.out.println(mysql2);
    }
}

class Mysql {
    private String host;
    private int port;
    private String user;
    private String password;

    //饿汉式：是因为还没打算用，只是调用了其他属性，就给你构造出来了，会造成资源的浪费
    private static Mysql mysql = new Mysql("127.0.0.1", 3306, "root", "123456");

    //饿汉式：
    //1、构造器私有化
    //2、类内部创建对象
    //3、向外暴露一个静态公共方法
    private Mysql(String host, int port, String user, String password) {
        this.host = host;
        this.port = port;
        this.user = user;
        this.password = password;
    }

    public static Mysql getInstance() {
        return mysql;
    }

    @Override
    public String toString() {
        return "Mysql{" +
                "host='" + host + '\'' +
                ", port=" + port +
                ", user='" + user + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}