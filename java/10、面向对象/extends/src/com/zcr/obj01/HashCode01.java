package com.zcr.obj01;

public class HashCode01 {
    public static void main(String[] args) {
        C c = new C();
        C c1 = new C();
        System.out.println("c=" + c.hashCode());
        System.out.println("c1=" + c1.hashCode());
    }
}

class C {

}
