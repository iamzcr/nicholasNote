package com.zcr.work.work06;

public class Test {
    public static void main(String[] args) {
        Student student = new Student("小明", "男", 10, 1);
        student.printInfo();
        Teacher teacher = new Teacher("老师", "男", 10, 1);
        teacher.printInfo();

        Person[] person = new Person[4];
        person[0] = new Student("stu1", "男", 21, 1);
        person[1] = new Student("stu2", "女", 6, 2);
        person[2] = new Teacher("teacher1", "男", 20, 10);
        person[3] = new Teacher("teacher2", "女", 19, 11);

        Test test = new Test();
        test.testSort(person);
        System.out.println("排序后......");
        for (int i = 0; i < person.length; i++) {
            System.out.println(person[i]);
            test.test(person[i]);
        }
    }

    public void test(Person person) {
        if (person instanceof Student) {
            ((Student) person).study();
        } else if (person instanceof Teacher) {
            ((Teacher) person).teach();
        } else {
            System.out.println("error");
        }
    }

    public void testSort(Person[] person) {
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
    }
}
