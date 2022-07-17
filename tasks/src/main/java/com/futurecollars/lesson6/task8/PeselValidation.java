package com.futurecollars.lesson6.task8;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PeselValidation {

    public static void main(String[] args) throws IllegalLengthException {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Write your PESEL");

        try {
            int givenPesel = scanner.nextInt();
            String pesel;
            pesel = String.valueOf(givenPesel);

            if (pesel.length() != 11) {
                throw new IllegalLengthException("Wrong data. ");
            }

            System.out.println("Your PESEL is " + pesel);


        } catch (InputMismatchException e) {
            throw new InputMismatchException("Wrong data type!");

        } catch (IllegalLengthException e) {
            throw new IllegalLengthException("PESEL is too short or too long!");
        }
    }

        public static class IllegalLengthException extends Exception {
            public IllegalLengthException(String message) {
                super(message);
            }


    }
}
