package com.zcr.single02;

public class Single02 {
    public static void main(String[] args) {
        Mysql mysql = Mysql.getInstance();
        System.out.println(mysql);
    }
}

class Mysql {
    private String host;
    private int port;
    private String user;
    private String password;

    private static Mysql mysql;

    public Mysql(String host, int port, String user, String password) {
        this.host = host;
        this.port = port;
        this.user = user;
        this.password = password;
    }
    //如果多个线程同时进来，会创建多个静态对象，会有线程安全的问题，要加锁
    public static Mysql getInstance() {
        if (mysql == null) {
            mysql = new Mysql("127.0.0.1", 3306, "root", "123456");
        }
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
