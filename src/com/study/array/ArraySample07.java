package com.study.array;

public class ArraySample07 {
    public static void main(String[] args) {
        int[][] score = {
                {42, 33, 78},
                {92, 65, 65},
                {64, 72, 91},
                {58, 84, 94}
        };
        int[] student = new int[4]; // 학생 총점 배열 생성
        int[] subject = new int[3]; // 과목 총점 배열 생성
        String[] studentName = {"A학생", "B학생", "C학생", "D학생"};    // 학생명 배열 저장
        String[] subjectName = {"영어", "수학", "과학"};  // 과목명 배열 저장

        for (int i = 0; i < student.length; i++) {
            for (int j = 0; j < subject.length; j++) {
                student[i] += score[i][j];  // 학생별 총점 계산
            }
            System.out.println(studentName[i] + "총점 : " + student[i]);
        }
        System.out.println("--------------");
        for (int j = 0; j < subject.length; j++) {
            for (int i = 0; i < student.length; i++) {
                subject[j] += score[i][j];  // 과목별 총점 계산
            }
            System.out.println(subjectName[j] + "총점 : " + subject[j]);
        }
    }
}

