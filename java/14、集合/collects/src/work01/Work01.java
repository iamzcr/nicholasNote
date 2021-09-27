package work01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Work01 {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(new Dog("test", 10));
        list.add(new Dog("test1", 11));
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object next = iterator.next();
            Dog dog = (Dog) next;
            System.out.println(dog.getName() + dog.getAge());
        }

        for (Object o : list) {
            Dog dog = (Dog) o;
            System.out.println(dog.getName() + dog.getAge());
        }
    }
}

class Dog {
    private String name;
    private int age;

    public Dog(String name, int age) {
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

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
