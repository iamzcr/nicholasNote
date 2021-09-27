package com.zcr.interfaceMysql;

public class Mysql implements DbInterface {
    @Override
    public void connect() {
        System.out.println("mysql链接上了...");
    }

    @Override
    public void close() {
        System.out.println("mysql关闭了...");
    }
}
