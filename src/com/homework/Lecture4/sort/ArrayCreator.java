package com.homework.Lecture4.sort;

import java.util.Random;

public class ArrayCreator {
   public static int[] createHugeArray(int n) {
        Random random = new Random();
        int[] result = new int[n];
        for(int index = 0; index < result.length; index++) {
            result[index] = random.nextInt((1_000_00) + 1_000_00);
        }
        return result;
    }





    /*public static int[] createHugeArray(int n) {
        Random random = new Random();
        int[] result = new int[random.nextInt(1_000_00) + 1_000_00];
        for(int index = 0; index < result.length; index++) {
            result[index] = random.nextInt(n);
        }
        return result;
    }*/
}
