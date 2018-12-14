package com.momin.main;

import bubble.BubbleSort;
import insertion.InsertionSort;

public class MainClass {
    public static void main(String[] args) {
        Integer[] array={3,2,5,7,2,4};
//        InsertionSort insertionSort=new InsertionSort();
//        insertionSort.sort(array);
        BubbleSort sort=new BubbleSort();
        sort.sort(array);

        for (Integer values:array) {
            System.out.println(values);
        }
    }
}
