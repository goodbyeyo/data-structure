package com.study.array;

import java.util.Arrays;

public class ArrayCopyRange01 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = Arrays.copyOfRange(arr1, 2, 4);
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i] + " ");
        }
    }
}
