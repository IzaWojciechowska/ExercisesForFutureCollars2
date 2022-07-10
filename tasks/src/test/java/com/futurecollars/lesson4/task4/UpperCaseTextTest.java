package com.futurecollars.lesson4.task4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UpperCaseTextTest {

    @Test
    void formatText() {
        // given
        String quote = "Narcissism is, indeed, the new world order...";
        String name = "dr Ramani Durvasula";

        // when
        UpperCaseText author = new UpperCaseText(name);
        String quoteAfterFormat = author.formatText(quote);

        // then
        Assertions.assertEquals("NARCISSISM IS, INDEED, THE NEW WORLD ORDER...", quoteAfterFormat);


    }
}