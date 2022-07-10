package com.futurecollars.lesson4.task4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LowerCaseTextTest {

    @Test
    void formatText() {
        // given
        String quote = "FAILURE IS ONLY A CALAMITY IF YOU LEARN NOTHING FROM IT";
        String name = "Joe Navarro";

        // when
        LowerCaseText author = new LowerCaseText(name);
        String quoteAfterFormat = author.formatText(quote);

        // then
        Assertions.assertEquals("failure is only a calamity if you learn nothing from it", quoteAfterFormat);
    }
}