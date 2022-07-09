package com.futurecollars.lesson2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AgeValidatorTest {

    @Test
    void shouldCheckAgeIsItAdult() {
        // given
        int givenAge = 18;

        // when
        boolean adult = AgeValidator.isAdult(givenAge);

        // then
        Assertions.assertEquals(true, adult);
    }
}