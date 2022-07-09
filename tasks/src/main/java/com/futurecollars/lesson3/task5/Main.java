package com.futurecollars.lesson3.task5;

public class Main {
    public static void main(String[] args) {

        double a = 3;
        double b = 4;
        double c = 5;

        System.out.println("Is triangle with sides: "
        + a + ", " + b + ", " + c + " rectangular?");
        System.out.println(RectangularTriangle.isTriangle(a, b, c));
    }
}
