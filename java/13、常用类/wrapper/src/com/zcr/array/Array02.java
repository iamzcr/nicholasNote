package com.zcr.array;

import java.util.Arrays;
import java.util.Comparator;

public class Array02 {
    public static void main(String[] args) {
        int arr[] = {10, 15, -2, 25, 65};
        System.out.println(Arrays.toString(arr));
        //bubble(arr);
        //System.out.println(Arrays.toString(arr));
        bubble2(arr, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Integer i1 = (Integer) o1;
                Integer i2 = (Integer) o2;
                return i1 - i2;
            }
        });
        System.out.println(Arrays.toString(arr));
    }

    public static void bubble(int arr[]) {
        int temp = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {//从小到大，<从大到小
                    //交换
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void bubble2(int arr[], Comparator comparator) {
        System.out.println(comparator.getClass());
        int temp = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (comparator.compare(arr[j], arr[j + 1]) > 0) {//从小到大，<从大到小
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
