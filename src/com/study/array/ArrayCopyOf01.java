package com.study.array;

import java.util.Arrays;

public class ArrayCopyOf01 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = Arrays.copyOf(arr1, 4);

        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i] + " ");
        }

        // arr1의 길이가 5밖에 안되므로 나머지는 기본값인 0으로 채워진다
        int[] arr3 = Arrays.copyOf(arr1, 10);   
        for (int i = 0; i < arr3.length; i++) {
            System.out.println(arr3[i] + " ");  
        }
    }
}
