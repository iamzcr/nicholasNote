package com.zcr.override02;

public class Detail {
    public static void main(String[] args) {
        Person person = new Person("zcr", 10);
        System.out.println(person.say());
        Student student = new Student("zsj", 20, 1, 20.2);
        System.out.println(student.say());
    }
}
