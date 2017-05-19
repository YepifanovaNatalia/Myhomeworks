package com.homework.Lecture3;

/**
 * Created by nat on 19.05.17.
 */

public class Insertsort {
    public static void main(String[] args){
        int[] array = {5, 7, 9, 15, 10, -1, 8};
        Insertsort(Arrays);


        for(int i = 1; i< array.length-1; i++ ) {
            System.out.println(Arrays.toString(array));

        }
    }
    /*public class BubbleSortExample {
        public static void main(String[] args) {
            int[] array = {5, 2, 4, 3, 7, 9};
            bubbleSort(array);

            System.out.println(Arrays.toString(array));

        }

        public static void bubbleSort(int[] array) {
            int temp;
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array.length - i - 1; j++) {
                    if (array[j] > array[j + 1]) {
                        temp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = temp;
                    }
                }
            }
        }
    }*/
}
