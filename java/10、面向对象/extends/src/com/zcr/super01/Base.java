package com.zcr.super01;

public class Base {
    public int n1 = 100;
    protected int n2 = 200;
    int n3 = 300;
    private int n4 = 400;

    public Base(){

    }

    public Base(int n1){

    }
    public void test100() {
        System.out.println("test100()......");
    }

    protected void test200() {
        System.out.println("test200()......");
    }

    void test300() {
        System.out.println("test300()......");
    }

    private void test400() {
        System.out.println("test400()......");
    }
}
