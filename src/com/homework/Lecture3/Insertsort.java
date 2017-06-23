package com.homework.Lecture3;

/**
 * Created by nat on 19.05.17.
 */
import java.util.Arrays;

public class Insertsort {
    public static void main(String[] args) {
        int[] array = {5, 7, 9, 15, 10, -1, 8};
        int temp;

        for(int i = 0; i < array.length; i++ ) {
            temp = array[i];
            for(int j = i - 1; j >= 0 && array[j] > temp; j--){
                array[j + 1] = array[j];
                array[j] = temp;
            }
        }
            System.out.println(Arrays.toString(array));
        }
    }

