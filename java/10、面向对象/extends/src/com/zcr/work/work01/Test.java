package com.zcr.work.work01;

public class Test {
    public static void main(String[] args) {
        Person[] person = new Person[3];
        person[0] = new Person("test", 15, "test");
        person[1] = new Person("test1", 19, "test1");
        person[2] = new Person("test2", 18, "test2");
        for (int i = 0; i < person.length; i++) {
            System.out.println(person[i]);
        }
        Person tmp = null;
        for (int i = 0; i < person.length - 1; i++) {
            for (int j = 0; j < person.length - 1 - i; j++) {
                if (person[j].getAge() > person[j + 1].getAge()) {//从小到大，<从大到小
                    //交换
                    tmp = person[j];
                    person[j] = person[j + 1];
                    person[j + 1] = tmp;
                }
            }
        }
        System.out.println("排序后......");
        for (int i = 0; i < person.length; i++) {
            System.out.println(person[i]);
        }
    }
}
