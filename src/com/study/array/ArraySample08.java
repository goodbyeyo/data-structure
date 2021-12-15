package com.study.array;

public class ArraySample08 {
    public static void main(String[] args) {
        int[][] ggd = new int[8][9];    // 구구단 값 저장을 위한 배열 생성
        for (int i = 0; i < 8; i++) {   // 단수(행) 반복
            for (int j = 0; j < 9; j++) {
                ggd[i][j] = (i + 2) * (j + 1);  // 배열에 값 저장
                System.out.print((i+2)+"*"+(j+1)+"="+ggd[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
