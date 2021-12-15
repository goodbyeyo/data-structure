package com.study.array;

public class ArraySample03 {
    // 자료형[] 변수 = new 자료형[배열크기] // 좌항과 우항의 자료형 통일
    // 변수[0] = 데이터 값;
    // 변수[1] = 데이터 값;

    public static void main(String[] args) {
        int[] num = new int[3];
        num[0] = 10;    // 0번 index에 값 할당
        num[1] = 20;    // 1번 index에 값 할당
        num[2] = 30;    // 2번 index에 값 할당

        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }
    }

}
