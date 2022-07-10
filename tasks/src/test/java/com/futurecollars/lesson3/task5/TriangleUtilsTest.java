package com.futurecollars.lesson3.task5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TriangleUtilsTest {

    @Test
    void isRightTriangle() {

        // given
        double a1 = 8;
        double b1 = 15;
        double c1 = 17;

        double a2 = 1;
        double b2 = 15;
        double c2 = 8;

        // when
        boolean result1 = TriangleUtils.isRightTriangle(a1, b1, c1);
        boolean result2 = TriangleUtils.isRightTriangle(a2, b2, c2);

        // then
        Assertions.assertEquals(true, result1);
        Assertions.assertEquals(false, result2);
    }
}