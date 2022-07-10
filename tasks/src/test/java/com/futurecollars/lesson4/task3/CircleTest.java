package com.futurecollars.lesson4.task3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    @Test
    void getArea() {
        // given
        double radius1 = 1;

        // when
        Circle circle1 = new Circle(radius1);
        double area1 = circle1.getArea();

        // then
        Assertions.assertEquals(3.14, area1);
    }

    @Test
    void getPerimeter() {

        // given
        double radius2 = 2;

        // when
        Circle circle2 = new Circle(radius2);
        double perimeter2 = circle2.getPerimeter();

        // then
        Assertions.assertEquals(12.56, perimeter2);
    }
}