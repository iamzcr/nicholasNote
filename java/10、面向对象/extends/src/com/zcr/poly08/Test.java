package com.zcr.poly08;

public class Test {
    public static void main(String[] args) {
        Worker worker = new Worker("test", 5000);
        Manager manager = new Manager("test", 5000, 2000);
        Test test = new Test();
        test.showEmpAnnual(worker);
        test.showEmpAnnual(manager);
        test.testWork(worker);
        test.testWork(manager);
    }

    public void showEmpAnnual(Employee e) {
        System.out.println(e.getAnnual());
    }

    //用父类接受
    public void testWork(Employee e) {
        if (e instanceof Worker) {
            ((Worker) e).work();
        } else if (e instanceof Manager) {
            ((Manager) e).manage();
        } else {
            System.out.println("非法操作");
        }
    }
}
