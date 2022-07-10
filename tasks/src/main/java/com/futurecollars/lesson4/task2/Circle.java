package com.futurecollars.lesson4.task2;

public class Circle extends Shape {
    // area: pi*(r^2)
    // perimeter: 2*pi*r
    // where "r" is a radius of a circle

    protected double r;

    public Circle(double r) {
        this.r = r;
    }

    @Override
    public double getArea() {
        area = 3.14 * r * r;
        return super.getArea();
    }

    @Override
    public double getPerimeter() {
        perimeter = 2 * 3.14 * r;
        return super.getPerimeter();
    }
}
