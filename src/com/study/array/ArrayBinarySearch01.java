package com.study.array;

import java.util.Arrays;

public class ArrayBinarySearch {
    public static void main(String[] args) {
        /*
        binarySearch() 메서드는 전달받은 배열에서 특정 객체의 위치를
        이진 검색 알고리즘을 사용하여 검색한 후 해당위치를 반환한다
        이 메소드는 이진 검색 알고리즘을 사용하므로, 매개변수로 전달되는 배열이
        sort() 메서드등을 사용하여 밀 정렬되어 있어야만 제대로 동작한다
        */

        // Declaring and initializing byte arrays
        // to search over them
        byte byteArr[] = { 10, 20, 15, 22, 35 };
        char charArr[] = { 'g', 'p', 'q', 'c', 'i' };
        int intArr[] = { 10, 20, 15, 22, 35 };
        double doubleArr[] = { 10.2, 15.1, 2.2, 3.5 };
        float floatArr[] = { 10.2f, 15.1f, 2.2f, 3.5f };
        short shortArr[] = { 10, 20, 15, 22, 35 };

        // Using sort() method of Arrays class
        // and passing arrays to be sorted as in arguments
        Arrays.sort(byteArr);
        Arrays.sort(charArr);
        Arrays.sort(intArr);
        Arrays.sort(doubleArr);
        Arrays.sort(floatArr);
        Arrays.sort(shortArr);

        // Primitive datatypes
        byte byteKey = 35;
        char charKey = 'g';
        int intKey = 22;
        double doubleKey = 1.5;
        float floatKey = 35;
        short shortKey = 5;

        // Now in sorted array array we will fetch and
        // return elements/indiciesaccessing indexes to show
        // array is really sorted

        // Print commands where we are implementing
        System.out.println(byteKey + " found at index = " + Arrays.binarySearch(byteArr, byteKey));
        System.out.println(charKey + " found at index = " + Arrays.binarySearch(charArr, charKey));
        System.out.println(intKey  + " found at index = " + Arrays.binarySearch(intArr, intKey));
        System.out.println(doubleKey + " found at index = " + Arrays.binarySearch(doubleArr, doubleKey));
        System.out.println(floatKey + " found at index = " + Arrays.binarySearch(floatArr, charKey));
        System.out.println(shortKey + " found at index = " + Arrays.binarySearch(shortArr, shortKey));

    }
}
