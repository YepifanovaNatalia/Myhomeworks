package com.homework.Lecture2;

/**
 * Created by nat on 17.05.17.
 */
public class AngelClock {
    public static void main(String[] args) {
        int hours = 2;
        int mins = 30;
        double result = 0;


        result = (hours +((double)mins /60)) * 30 - (mins * 6);

        System.out.println("Angle between hours and minute narrows is " + Math.abs((int) result));


    }

}
