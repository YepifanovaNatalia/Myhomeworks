package com.homework.Lecture4;

/**
 * Created by nat on 03.07.17.
 */

public class FibonacciNumbers {
    public static void main(String[] args) {

        int fibonacci = fibonacci(0);
        int n = 10;

        for (int i = 0; i <= n; i++){
            System.out.print(fibonacci(i) + " ");
        }
    }

    private static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1){
            return 1;
        }
        else return fibonacci(n -1) + fibonacci(n - 2);
    }
}



