package com.futurecollars.lesson4.task4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MotivationalBookTest {

    @Test
    void formatText() {
        // given
        String quote = "failure is only a calamity if you learn nothing from it";
        String name = "Joe Navarro";

        // when
        MotivationalBook author = new MotivationalBook(name);
        String quoteAfterFormat = author.formatText(quote);

        // then
        Assertions.assertEquals("FAILURE IS ONLY A CALAMITY IF YOU LEARN NOTHING FROM IT", quoteAfterFormat);


    }
}