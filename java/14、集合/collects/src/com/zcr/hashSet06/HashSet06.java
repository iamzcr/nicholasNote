//重写hashCode和equals方法，让属性相同的两个对象不能加入
package com.zcr.hashSet06;

import java.util.HashSet;
import java.util.Objects;

public class HashSet06 {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
        Employee employee1 = new Employee("zcr", 30);
        Employee employee2 = new Employee("zsj", 29);
        Employee employee3 = new Employee("zcr", 30);
        hashSet.add(employee1);
        hashSet.add(employee2);
        hashSet.add(employee3);
        System.out.println(hashSet);
    }
}

class Employee {
    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //重写equals方法，让Employee名字和年龄相同的对象出来的hashCode一样
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return age == employee.age && Objects.equals(name, employee.name);
    }
    //重写hashCode方法，让Employee名字和年龄相同的对象出来的hashCode一样
    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
