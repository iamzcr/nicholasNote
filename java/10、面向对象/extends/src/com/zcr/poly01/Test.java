package com.zcr.poly01;

public class Test {
    public static void main(String[] args) {
        Person person = new Person("zcr");
        Dog dog = new Dog("test");
        Bone bone = new Bone("骨头");
        person.feed(dog, bone);
    }
}
