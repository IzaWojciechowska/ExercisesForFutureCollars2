package com.futurecollars.lesson4.task6;

public class Main {

    public static void main(String[] args) {

        double billValue1 = 100.5;
        float serviceFee1 = 25;
        double discount1 = 50.0;
        short feeForTakeAway1 = 2;

        BillCalculator.calculate(billValue1, serviceFee1);

        BillCalculator.calculate(billValue1, serviceFee1, discount1);

        BillCalculator.calculate(billValue1, serviceFee1, feeForTakeAway1);




    }
}
