package com.homework.Lecture4.sort;

import java.util.Arrays;


public class HugeArraySorter {
    static int[] hugeArray = ArrayCreator.createHugeArray(10);

    public static void main(String[] args) {

        sort(hugeArray);


        for (int index = 0; index < hugeArray.length - 1; index++) {
            if (hugeArray[index] > hugeArray[index + 1]) {
                System.out.println("Sort failed!!!");
                return;
            }
        }
        System.out.println(Arrays.toString(hugeArray));
        System.out.println("Sort successful!!");
    }


    public static void sort(int[] array) {
        int startIndex = 0;
        int endIndex = array.length - 1;
        doSort(hugeArray, startIndex, endIndex);
    }

    private static void doSort(int[] array, int start, int end) {
        if (start >= end)
            return;
        int i = start, j = end;
        int cur = i - (i - j) / 2;
        while (i < j) {
            while (i < cur && (array[i] <= array[cur])) {
                i++;
            }
            while (j > cur && (array[cur] <= array[j])) {
                j--;
            }
            if (i < j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                if (i == cur)
                    cur = j;
                else if (j == cur)
                    cur = i;
            }
        }
        doSort(hugeArray, start, cur);
        doSort(hugeArray,cur + 1, end);
    }
}






