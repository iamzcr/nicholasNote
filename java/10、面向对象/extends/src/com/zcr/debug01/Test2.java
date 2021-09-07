package com.zcr.debug01;

import java.util.Arrays;

public class Test2 {
    public static void main(String[] args) {
        int arr[] = {1, 10, -1};
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("i=" + i);
        }
    }
}
