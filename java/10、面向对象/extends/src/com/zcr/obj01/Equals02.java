//重写object类的equals方法
package com.zcr.obj01;

public class Equals02 {
    public static void main(String[] args) {
        Person person1 = new Person("test", 10);
        Person person2 = new Person("test", 10);
        Person person3 = new Person("test1", 10);
        System.out.println(person1.equals(person2));
        System.out.println(person1.equals(person3));
    }
}

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Person) {
            Person p = (Person) obj;
            if (this.age == p.age && this.name.equals(p.name)) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }
}
