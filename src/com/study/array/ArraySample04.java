package com.study.array;

import java.util.Scanner;

public class ArraySample04 {
    public static void main(String[] args) {
        int[] num = new int[5]; // 배열 생성
        int max, min;
        Scanner sc = new Scanner(System.in);
        System.out.println("5개의 정수를 입력하시오");

        for (int i = 0; i < num.length; i++) {
            num[i] = sc.nextInt();
        }
        max = num[0];   // 최대값 초기설정
        min = num[0];   // 최소값 초기설정
        for (int i = 0; i < num.length; i++) {
            if(max < num[i]) {      // 최대값 비교
                max = num[i];       // 최대값 할당
            }
            if (min > num[i]) {     // 최소값 비교
                min = num[i];       // 최대값 할당
            }
        }
        System.out.println("max = " + max);
        System.out.println("min = " + min);
    }
}
