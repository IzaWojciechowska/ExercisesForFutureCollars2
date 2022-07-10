package com.futurecollars.lesson4.task3;

public class Main {

    public static void main(String[] args) {

        Circle circle = new Circle(1);
        System.out.println("\nArea of this circle is: " + circle.getArea());
        System.out.println("Perimeter of this circle is: " + circle.getPerimeter());

        Rectangle rectangle = new Rectangle(5, 2);
        System.out.println("\nArea of this rectangle is: " + rectangle.getArea());
        System.out.println("Perimeter of this rectangle is: " + rectangle.getPerimeter());
    }
}
