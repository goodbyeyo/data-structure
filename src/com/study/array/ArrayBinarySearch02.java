package com.study.array;

import java.util.*;

public class ArrayBinarySearch02 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(15);
        list.add(93);
        list.add(79);
        list.add(47);
        list.add(72);

        int index = Collections.binarySearch(list, 47);
        System.out.println("index = " + index);

    }
}
