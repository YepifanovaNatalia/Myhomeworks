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
                {3, 4, 5},
                {7, 5, 1},
                {3, 4, 6}
        };

        int m = first.length;
        int n = second[0].length;
        int o = second.length;
        int[][] result = new int[m][n];
        int firstTemp = first[0].length;
        int secondTemp = second[0].length;
        boolean isRectangular = true;

        for (int i = 1; i < first.length; i++) {
            if (firstTemp != first[i].length) {
                isRectangular = false;
                System.out.println("The matrix isn`t rectangular.");
                break;
            }
        }

        for (int i = 1; i < second.length; i++) {
            if (secondTemp != second[i].length) {
                isRectangular = false;
                System.out.println("The matrix isn`t rectangular.");
                break;
            }
        }

        if (isRectangular) {
            if (first[0].length != second.length) {
                System.out.println("The length of first matrix`s row should be equal to the length of second matrix`s column.");
            }
            else {
                for (int i = 0; i < m; i++) {
                    for (int j = 0; j < n; j++) {
                        for (int k = 0; k < o; k++) {
                            result[i][j] += first[i][k] * second[k][j];
                        }
                    }
                }
            }

            for (int i = 0; i < result.length; i++) {
                for (int j = 0; j < result[0].length; j++) {
                    System.out.format("%8d ", result[i][j]);
                }
                System.out.println();
            }
        }

    }
}














