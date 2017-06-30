package com.homework.Lecture3;


public abstract class MatrixPrinter {
    public static void main(String[] args) {
        int[][] array = {
                {1, 200, 3, -4},
                {3, 4, 5250, 60000},
                {7, 5, 4, 1}
        };

        int maxValue = 0;
        boolean hasNegative = false;

        for (int[] row : array) {
            for (int element : row) {
                int temp = element;
                if (element < 0) {
                    hasNegative = true;
                    temp = -temp;
                }
                if (temp > maxValue) {
                    maxValue = temp;
                }
            }
        }
        int len = Integer.toString(maxValue).length() + 1;

        if (hasNegative) {
            ++len;
        }

        final String formatString = "%" + (-len) + "d";

        for (int i = 0; i < array.length; ++i) {
            for (int j = 0; j < array[0].length; ++j) {
                System.out.printf(formatString, array[i][j]);
            }
                System.out.println();
        }
    }
}



