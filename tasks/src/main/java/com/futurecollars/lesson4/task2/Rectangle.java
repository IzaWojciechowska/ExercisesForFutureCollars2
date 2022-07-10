package com.futurecollars.lesson4.task2;

public class Rectangle extends Square {
    // pole: a*b
    // obwod 2*a+2*b
    // where "a" and "b" are lengths of two sides of a rectangle

    protected double b;

    public Rectangle(double a, double b) {
        super(a);
        this.b = b;
    }

    @Override
    public double getArea() {
        area = a * b;
        return super.getArea();
    }

    @Override
    public double getPerimeter() {
        perimeter = 2 * a + 2 * b;
        return super.getPerimeter();
    }
}
