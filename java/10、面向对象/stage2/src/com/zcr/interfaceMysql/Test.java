package com.zcr.interfaceMysql;

public class Test {
    public static void main(String[] args) {
        Mysql mysql = new Mysql();
        Pgsql pgsql = new Pgsql();
        Test.connect(mysql);
        Test.connect(pgsql);
    }

    public static void connect(DbInterface dbInterface) {
        dbInterface.connect();
        dbInterface.close();
    }
}
