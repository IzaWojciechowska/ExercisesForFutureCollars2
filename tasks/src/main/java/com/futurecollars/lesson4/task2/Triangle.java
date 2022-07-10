package com.futurecollars.lesson4.task2;

public class Triangle extends Shape {
    // area: (1/2)*a*h
    // perimeter: a+b+c
    // where "h" is height, "a" is length of a base side, "b" and "c" are lengths of two other sides of a triangle

    protected double h;
    protected double a;
    protected double b;
    protected double c;

    public Triangle(double h, double a, double b, double c) {
        this.h = h;
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double getArea() {
        area = 0.5 * a * h;
        return super.getArea();
    }

    @Override
    public double getPerimeter() {
        perimeter = a + b + c;
        return super.getPerimeter();
    }
}
