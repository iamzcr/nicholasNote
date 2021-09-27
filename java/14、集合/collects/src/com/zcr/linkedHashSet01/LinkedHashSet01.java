//重写hashCode和equals方法，让属性相同的两个对象不能加入
package com.zcr.linkedHashSet01;

import java.util.LinkedHashSet;
import java.util.Objects;

public class LinkedHashSet01 {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(new Car("test", 1000));
        linkedHashSet.add(new Car("test1", 2000));
        linkedHashSet.add(new Car("test2", 3000));
        linkedHashSet.add(new Car("test3", 4000));
        linkedHashSet.add(new Car("test2", 3000));
        linkedHashSet.add(new Car("test4", 5000));

        linkedHashSet.add(new Car("test2", 3000));
        System.out.println(linkedHashSet);
    }
}

class Car {
    private String name;
    private double price;

    public Car(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Double.compare(car.price, price) == 0 && Objects.equals(name, car.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }

    @Override
    public String toString() {
        return "\nCar{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
