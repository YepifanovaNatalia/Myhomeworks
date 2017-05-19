package com.homework.Lecture2;

import java.util.Map;

/**
 * Created by nat on 17.05.17.
 */
public class TriangelSquare {
    public static void main(String[] args) {
        int x1 = 1, y1 = 1;
        int x2 = 10, y2 = 7;
        int x3 = -3, y3 = 4;
        double length = 0;
        double square = 0;

        double f = 0;
        double s = 0;
        double t = 0;



        f = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
        s = Math.sqrt((x1 - x3) * (x1 - x3) + (y1 - y3) * (y1 - y3));
        t = Math.sqrt((x2 - x3) * (x2 - x3) + (y2 - y3) * (y2 - y3));

        length = f + s + t;

        if(f + s <= t || s + t <= f || f + t <= s)
            System.out.println("Error");
        else {
            double p = (f + s + t) / 2;
            square = Math.sqrt(p * (p - f) * (p - s) * (p - t));

        }


        System.out.println("Length of all sides is " + Math.round(length));
        System.out.println("Square is " + Math.ceil(square));
    }
}


