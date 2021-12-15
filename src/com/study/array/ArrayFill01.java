package com.study.array;

import java.util.Arrays;

public class ArrayFill01 {
    public static void main(String[] args) {
        int[] arr = new int[10];

        Arrays.fill(arr, 7);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
    }
}
