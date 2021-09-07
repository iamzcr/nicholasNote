package com.zcr.extend01;

public class Extends01 {
    public static void main(String[] args) {
        Pupli pupli = new Pupli();
        pupli.name = "zcr";
        pupli.setScore(60);
        pupli.testing();
        pupli.showInfo();

        Graduate graduate = new Graduate();
        graduate.name = "zsj";
        graduate.setScore(80);
        graduate.testing();
        graduate.showInfo();
    }
}
