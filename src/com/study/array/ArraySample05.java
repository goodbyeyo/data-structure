package com.study.array;

public class ArraySample05 {
    public static void main(String[] args) {
        // for ( 자료형 변수 : 배열 ) {    // 배열의 값이 있으면 자료형 변수로 값을 보내주고
        // 반복 실행할 문장;               // 문장이 실행
        // }                            // 값이 없으면 종료

        int[] score = {78, 70, 30, 89, 94};
        int sum = 0;
        for (int i : score) {
            sum += i;   // sum = sum + i
        }
        System.out.println("sum = " + sum);
    }
}
