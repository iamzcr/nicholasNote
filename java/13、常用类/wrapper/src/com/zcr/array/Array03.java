package com.zcr.array;

import java.util.Arrays;
import java.util.List;

public class Array03 {
    public static void main(String[] args) {
        int[] arr = {10, 15, -2, 25, 65};
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        //二叉树查找，要求该数组是有序的，返回下标，不存在返回的是-(low + 1),应该在的位置+1
        System.out.println(Arrays.binarySearch(arr, 115));

        //从arr数组中拷贝arr.length-1这么多个元素到copyArr中
        int[] copyArr = Arrays.copyOf(arr, arr.length - 1);
        System.out.println(Arrays.toString(copyArr));

        //数组填充
        Integer[] arr1 = new Integer[]{10, 15, -2};
        Arrays.fill(arr1, 99);
        System.out.println(Arrays.toString(arr1));

        //数组比较
        Integer[] arr2 = new Integer[]{10, 15, -2};
        Integer[] arr3 = new Integer[]{10, 15, -2};
        System.out.println(Arrays.equals(arr2, arr3));

        //转list,返回的编译类型是List(接口)，asList运行类型是java.util.Arrays$ArrayList内部类
        List asList = Arrays.asList(1, 1, 2, 3, 4);
        System.out.println(asList);
        System.out.println(asList.getClass());
    }
}
