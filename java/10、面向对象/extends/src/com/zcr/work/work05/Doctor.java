package com.zcr.work.work05;


public class Doctor {
    private String name;
    private int age;
    private String job;
    private String gender;
    private double sal;

    public Doctor(String name, int age, String job, String gender, double sal) {
        this.name = name;
        this.age = age;
        this.job = job;
        this.gender = gender;
        this.sal = sal;
    }

    public boolean equals(Object obj) {
        //判断是否是同一个对象
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Doctor)) {
            return false;
        }
        if (obj instanceof Doctor) {//保证了运行类型是Doctor或者是之类
            Doctor doctor = (Doctor) obj;//向下转型
            return this.age == doctor.age && this.name.equals(doctor.name) &&
                    this.sal == doctor.sal && this.job.equals(doctor.job) &&
                    this.gender.equals(doctor.gender);
        }
        return false;
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

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }
}
