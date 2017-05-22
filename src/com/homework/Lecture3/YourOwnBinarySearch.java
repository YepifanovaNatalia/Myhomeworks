package com.homework.Lecture3;

public class YourOwnBinarySearch {
    static int[] array = {1, 4, 7, 10, 17, 30, 48};
    static int element = 10;

    public static void main(String[] args) {
        System.out.println(binarySearch(array, element));
    }


    private static int binarySearch(int[] array, int elem) {
        int result = -1;

        int left = 0;
        int right = array.length;



        while (left <= right){
            int midle = (left + right)/2;



            if (array[midle] < element)
                left = midle + 1;
            else if (array[midle] > element)
                right = midle - 1;
            else {

                result = midle;
                break;
            }


        }

        return result;

    }

}



