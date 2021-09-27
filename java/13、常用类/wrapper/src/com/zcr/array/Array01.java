package com.zcr.array;

import java.util.Arrays;
import java.util.Comparator;

public class Array01 {
    public static void main(String[] args) {
        int arr[] = new int[5];
        System.out.println(Arrays.toString(arr));

        Integer arr1[] = {10, 15, 2, 25, 65};
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));
        Arrays.sort(arr1, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Integer i1 = (Integer) o1;
                Integer i2 = (Integer) o2;
                return i2 - i1;
            }
        });
        System.out.println(Arrays.toString(arr1));
    }
}
