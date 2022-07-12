package com.futurecollars.lesson5.task3;

public class Calculator implements TypesOfCalculations {

    private double a;
    private double b;

    public Calculator(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double add() {
        return a + b ;
    }

    @Override
    public double subtract() {
        return a - b;
    }

    @Override
    public double multiply() {
        return a * b;
    }

    @Override
    public double divide() {
        return a / b;
    }

}

