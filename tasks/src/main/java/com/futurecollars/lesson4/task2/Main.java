package com.futurecollars.lesson4.task2;

public class Main {

    public static void main(String[] args) {

        Shape circle1 = new Circle(8);
        System.out.println("\nArea of circle1 is: " + circle1.getArea());
        System.out.println("Perimeter of circle1 is: " + circle1.getPerimeter());

        Shape triangle1 = new Triangle(1, 1, 1, 1);
        System.out.println("\nArea of triangle1 is: " + triangle1.getArea());
        System.out.println("Perimeter of triangle1 is: " + triangle1.getPerimeter());

        Shape square1 = new Square(2);
        System.out.println("\nArea of square1 is: " + square1.getArea());
        System.out.println("Perimeter of square1 is: " + square1.getPerimeter());

        Shape rectangle1 = new Rectangle(5, 5);
        System.out.println("\nArea of rectangle1 is: " + rectangle1.getArea());
        System.out.println("Perimeter of rectangle1 is: " + rectangle1.getPerimeter());
    }
}
