package com.futurecollars.lesson3.task4;

import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

class MinutesToSecondsConverterTest {

    @org.junit.jupiter.api.Test
    void minutesToSeconds() {

        // given
        int minutes1 = 10;
        int minutes2 = 30;

        // when
        int seconds1 = MinutesToSecondsConverter.minutesToSeconds(minutes1);
        int seconds2 = MinutesToSecondsConverter.minutesToSeconds(minutes2);

        // then
        Assertions.assertEquals(600, seconds1);
        Assertions.assertEquals(1800, seconds2);
    }
}