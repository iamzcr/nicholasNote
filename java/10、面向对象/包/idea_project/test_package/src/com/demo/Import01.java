package com.demo;

import java.util.Arrays;

public class Import01 {
    public static void main(String[] args) {
        int arr[] = {-1, 20, 21, 2, 16};
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
