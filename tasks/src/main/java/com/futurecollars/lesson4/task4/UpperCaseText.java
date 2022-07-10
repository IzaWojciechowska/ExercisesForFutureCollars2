package com.futurecollars.lesson4.task4;

public class UpperCaseText implements TextFormatter{

    protected String name;

    public UpperCaseText(String name) {
        this.name = name;
    }

    @Override
    public String formatText(String text) {
        return text.toUpperCase();
    }
}
