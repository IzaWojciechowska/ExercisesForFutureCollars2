package com.futurecollars.lesson6.task7;

public class CalculateTheRoot {

    public static void main(String[] args) {

        try {
            double num = -9;

            if ( num < 0) {
                throw new IllegalArgumentException("Only positive numbers!!");
            }

            System.out.println("The result of calculation is " + Math.sqrt(num));

        } catch (IllegalArgumentException e) {
            System.out.println("Invalid output! " + e.getMessage());
        }


    }
}
