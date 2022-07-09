package com.futurecollars.lesson2;

public class Main {
    public static void main(String[] args) {

        // to task 4 - verification of age
        if (AgeValidator.isAdult(18) == true) {
            System.out.println("Is adult.");
        } else
            System.out.println("Is not adult.");
    }
}
