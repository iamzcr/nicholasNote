package com.zcr.system;

import java.util.Arrays;

public class System01 {
    public static void main(String[] args) {
        System.out.println("test");
        //System.exit(0);//0标识正常退出
        //System.out.println("test2");

        int[] test = {1, 2, 3};
        int[] test2 = new int[3];
        System.arraycopy(test, 0, test2, 0, 3);
        System.out.println(Arrays.toString(test2));
        System.out.println(System.currentTimeMillis());
        ;
    }
}
