package com.study.array;

public class ArraySample02 {
    public static void main(String[] args) {
        int[] score = { 92, 83, 35, 55, 73, 89};
        int sum = 0;
        for (int i = 0; i < score.length; i++) {
            sum += score[i];
        }
        double avg = (double)sum / score.length;    // 형변환
        System.out.println("sum = " + sum);
        System.out.println("avg = " + avg);
    }
}
