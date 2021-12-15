package com.study.array;

public class ArraySample06 {
    public static void main(String[] args) {
        int[][] num = {
                        {4, 3, 7},
                        {7, 2, 1},
                        {6, 3, 9},
                        {5, 2, 1}
                      };
        for(int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println(i + "행 " + j + "열의 값:" + num[i][j]);
            }
        }
    }
}
