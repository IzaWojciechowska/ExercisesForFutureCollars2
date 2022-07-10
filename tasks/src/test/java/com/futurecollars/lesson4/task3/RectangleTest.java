package com.futurecollars.lesson4.task3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    void getArea() {
        // given
        double a = 2;
        double b= 5;

        // when
        Rectangle rectangle = new Rectangle(a, b);
        double area = rectangle.getArea();

        // then
        Assertions.assertEquals(10, area);
    }

    @Test
    void getPerimeter() {
        // given
        double a = 3;
        double b= 4;

        // when
        Rectangle rectangle = new Rectangle(a, b);
        double perimeter = rectangle.getPerimeter();

        // then
        Assertions.assertEquals(14, perimeter);
    }
}