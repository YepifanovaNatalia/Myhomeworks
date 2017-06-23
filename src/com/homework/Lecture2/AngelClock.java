package com.homework.Lecture2;

/**
 * Created by nat on 17.05.17.
 */
public class AngelClock {
    public static void main(String[] args) {
        int hours = 28;
        int mins = 30;
        double result = 0;
        double angel;

        if ((hours <= 23) && (mins <= 59)) {
            result = (hours + ((double) mins / 60)) * 30 - (mins * 6);
            if (result >= 180) {
                angel = 360 - result;
            }
            else {
                angel = result;
            }
            System.out.println("Angle between hours and minute narrows is " + Math.abs((int) angel));
        }
        else {
            System.out.println("Incorrect data");
        }
    }
}
