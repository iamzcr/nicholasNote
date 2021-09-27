package com.zcr.interfaceMysql;

public class Pgsql implements DbInterface {
    @Override
    public void connect() {
        System.out.println("pgsql链接上了......");
    }

    @Override
    public void close() {
        System.out.println("pgsql关闭了上了......");
    }
}
