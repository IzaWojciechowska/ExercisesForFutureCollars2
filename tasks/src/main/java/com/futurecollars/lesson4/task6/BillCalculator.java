package com.futurecollars.lesson4.task6;

public class BillCalculator {

    public static void calculate(double billValue, float serviceFee) {
        System.out.println("Your final value of the bill is: " +
                (billValue + serviceFee) );
    }

    public static void calculate(double billValue, float serviceFee, double discount) {
        System.out.println("Your final value of the bill is: " +
            ( billValue + serviceFee - (billValue * (discount * 0.01)) ) );
    }

    public static void calculate(double billValue, float serviceFee, short feeForTakeAway) {
        System.out.println("Your final value of the bill is: " +
                (billValue + serviceFee + feeForTakeAway));
    }
}
