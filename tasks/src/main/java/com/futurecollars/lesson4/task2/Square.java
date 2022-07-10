package com.futurecollars.lesson4.task2;

public class Square extends Shape {
    // area : a*a
    // perimeter: 4*a
    // where "a" is length of one side of a square

    protected double a;

    public Square(double a) {
        this.a = a;
    }

    @Override
    public double getArea() {
        area = a * a;
        return super.getArea();
    }

    @Override
    public double getPerimeter() {
        perimeter = 4 * a;
        return super.getPerimeter();
    }
}
