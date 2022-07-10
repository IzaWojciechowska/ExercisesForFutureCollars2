package com.futurecollars.lesson4.task4;

import java.util.Locale;

public class LowerCaseText implements TextFormatter{

    protected String name;

    public LowerCaseText(String name) {
        this.name = name;
    }

    @Override
    public String formatText(String text) {
        return text.toLowerCase();
    }
}
