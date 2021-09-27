package com.zcr.work03;

interface Calcul {
    public double work(double n1, double n2);
}

class Phone {

    public void testWork(Calcul calcul, double n1, double n2) {
        double result = calcul.work(n1, n2);
        System.out.println("结果=" + result);
    }
}