package com.zcr.work01;

public class Work03 {
    public static void main(String[] args) {
        String name = "jj";
        String pwd = "124116";
        String email = "test@qq.com";
        try {
            System.out.println(checkData(name, pwd, email));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }

    public static String checkData(String name, String pwd, String email) {
        int useLength = name.length();
        int pwdLength = pwd.length();
        if (!(useLength >= 2 && useLength <= 4)) {
            throw new RuntimeException("用户名不对");
        }
        if (!(pwdLength == 6 && checkNum(pwd))) {
            throw new RuntimeException("密码不对");
        }
        int i = email.indexOf('@');
        int j = email.indexOf('.');
        if (!(i > 0 && j > i)) {
            throw new RuntimeException("邮箱不对");
        }
        return "success";
    }

    public static boolean checkNum(String str) {
        char chars[] = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] < '0' || chars[i] > '9') {
                return false;
            }
        }
        return true;
    }
}
