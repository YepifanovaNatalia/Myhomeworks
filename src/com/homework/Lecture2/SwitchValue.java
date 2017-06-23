package com.homework.Lecture2;

/**
 * Created by nat on 16.05.17.
 */
public class SwitchValue {
    public static void main(String[] args) {
        int first = 5;
        int second = 10;

        second = second + first;
        first = second - first;
        second = second - first;

        System.out.println("First = " + first + " , second = " + second);
    }
}
