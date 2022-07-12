package com.futurecollars.lesson5.task3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        runCalculator();
    }


    public static void runCalculator() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give two numbers: ");
        double firstNum = scanner.nextDouble();
        double secondNum = scanner.nextDouble();
        Calculator calculator = new Calculator(firstNum, secondNum);

        System.out.println("Choose type of calculation:\n" +
                "1 - addition\n" +
                "2 - substraction\n" +
                "3 - multiplication\n" +
                "4 - division");

            switch (scanner.nextInt()) {
                case 1:
                    System.out.println(calculator.add());
                    break;
                case 2:
                    System.out.println(calculator.subtract());
                    break;
                case 3:
                    System.out.println(calculator.multiply());
                    break;
                case 4:
                    System.out.println(calculator.divide());
                    break;
                default:
                    System.out.println("There is no such a calculation.");
                    break;
            }
    }


}
