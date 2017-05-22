package com.homework.Lecture3;

/**
 * Created by nat on 19.05.17.
 */

import java.util.Arrays;
import java.util.ArrayList;

public class MatrixInverter {
    public static void main(String[] args) {
        int[][] array = {
                {1, 2, 3, 4},
                {3, 4, 5, 6},
                {7, 7, 4, 1},
                {7, 5, 4, 1}
        };
        int[] n = new int[4];
        int[] m = new int[4];
        int temp;






        for(int i = 0; i < n.length; i++) {
            for (int j = 0; j < m.length; j++) {
                if ((i != j) && (i < j)){
                temp = array[i][j];
                array[i][j] = array[j][i];
                array[j][i] = temp;}


            }
        }
        for(int i = 0; i < n.length; i++){





            System.out.println(Arrays.toString(array[i]));



        }
    }
}









