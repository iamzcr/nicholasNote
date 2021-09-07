package com.zcr.poly01.optimize01;

public class Test {
    public static void main(String[] args) {
        Person person = new Person("zcr");

        Animal animal = new Dog("test");
        Food food = new Bone("骨头");
        person.feed(animal, food);

        animal = new Cat("test1");
        food = new Fish("鱼");
        person.feed(animal, food);


        //或者这样调用
        Dog dog = new Dog("test");
        Bone bone = new Bone("骨头");
        person.feed(dog, bone);

        Cat cat = new Cat("test1");
        Fish fish = new Fish("鱼");
        person.feed(cat, fish);
    }
}
