package com.futurecollars.lesson3.task5;
import java.lang.*;

public class TriangleUtils {

    // used the Pythagorean theorem for calculations
    public static boolean isRightTriangle(double a, double b, double c) {
        if ( Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2)) {
            return true;
        } else {
            return false;
        }
    }
}
