package com.zcr.encap;

public class E01 {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("zcr");
        person.setAge(300);
        person.setSalary(3000);
        System.out.println(person.info());

        Person person1 = new Person("zcr",10,1.2);
    }
}

class Person {
    public String name;
    private int age;
    private double salary;

    public Person() {
    }

    //三个属性的构造器，如果直接这样做，会直接在创建对象的时候暴露了私有变量，此时可以把set方法写到自定义构造器里面即可
    public Person(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        setName(name);
        setAge(age);
        setSalary(salary);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() >= 2 && name.length() <= 6) {
            this.name = name;
        } else {
            System.out.println("名字长度不对");
            this.name = "没名字";
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 1 && age <= 120) {
            this.age = age;
        } else {
            System.out.println("年龄需要在1-120");
            //给一个默认年龄
            this.age = 18;
        }
    }

    public double getSalary() {
        //可以增加一个当前对象的权限判断
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String info() {
        return "信息为:name=" + name + " age=" + age + " 薪水=" + salary;
    }
}