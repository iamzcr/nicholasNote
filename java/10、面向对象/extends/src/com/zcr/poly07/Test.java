//多态数组
package com.zcr.poly07;

public class Test {
    public static void main(String[] args) {
        Person[] personArr = new Person[5];
        personArr[0] = new Teacher("teacher1", 40, 2000);
        personArr[1] = new Teacher("teacher2", 50, 3000);
        personArr[2] = new Student("student1", 20, 33.3);
        personArr[3] = new Student("student2", 21, 66.6);
        personArr[4] = new Person("person", 25);
        for (int i = 0; i < personArr.length; i++) {
            System.out.println(personArr[i].say());
            if (personArr[i] instanceof Teacher) {
                Teacher teacher = (Teacher) personArr[i];
                teacher.teach();
                //第二种写法
                //((Teacher) personArr[i]).teach();
            } else if (personArr[i] instanceof Student) {
                ((Student) personArr[i]).study();
            } else {
                System.out.println("类型有误");
            }
        }
    }
}
