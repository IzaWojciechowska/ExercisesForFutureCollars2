package com.futurecollars.lesson4.task4;

import java.util.Locale;

public class PsychologyBook implements TextFormatter{

    protected String name;

    public PsychologyBook(String name) {
        this.name = name;
    }

    @Override
    public String formatText(String text) {
        return text.toLowerCase();
    }
}
