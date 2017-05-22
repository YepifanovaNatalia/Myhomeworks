package com.homework.Lecture3;

import java.util.Arrays;

/**
 * Created by nat on 19.05.17.
 */



public class MatrixMultiplier {
    public static void main(String[] args) {
        int[][] first = {
                {1, 2, 3, 4},
                {3, 4, 5, 6},
                {7, 5, 4, 1}
        };

        int[][] second = {
                {1, 2, 3},
                {3, 4, 6},
                {7, 5, 1},
                {3, 4, 6}
        };

        int m = first.length;
        int n = second[0].length;
        int o = second.length;
        int[][] result = new int[m][n];

        if (first[0].length != second.length){
            System.out.println("incorrect data");
        }
        else
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    for (int k = 0; k < o; k++) {
                        result[i][j] += first[i][k] * second[k][j];
                    }
                }
            }

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                System.out.format("%8d " , result[i][j]);
            }
            System.out.println();
        }
    }

        /*int a = first.length;
        int b = second.length;
        int c = second[0].length;

        int[][] result = new int[a][c];



        for (int i = 0; i < first.length; i++) {
            for (int j = 0; j < second.length; j++) {


                for (int n = 0; n < second[0].length; n++) {

                    result[n][i] += first[i][n] * second[j][n];


                    if (first.length != second[0].length) {
                        System.out.println("incorrect data");
                    }
                       else System.out.println(Arrays.deeptoString(result));*/

                    }
                }

            }

        }



    }
