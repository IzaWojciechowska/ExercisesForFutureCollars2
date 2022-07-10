package com.futurecollars.lesson4.task4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PsychologyBookTest {

    @Test
    void formatText() {
        // given
        String quote = "NARCISSISM IS, INDEED, THE NEW WORLD ORDER...";
        String name = "dr Ramani Durvasula";

        // when
        PsychologyBook author = new PsychologyBook(name);
        String quoteAfterFormat = author.formatText(quote);

        // then
        Assertions.assertEquals("narcissism is, indeed, the new world order...", quoteAfterFormat);
    }
}