package com.zcr.extend01.optimize01;

public class Extends02 {
    public static void main(String[] args) {
        Pupil pupli = new Pupil();
        pupli.name = "zcr";
        pupli.setScore(70);
        pupli.testing();
        pupli.showInfo();

        Graduate graduate = new Graduate();
        graduate.name = "zsj";
        graduate.setScore(70);
        graduate.testing();
        graduate.showInfo();
    }
}
