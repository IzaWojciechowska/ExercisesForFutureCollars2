package com.futurecollars.lesson4.task4;

public class MotivationalBook implements TextFormatter{

    protected String name;

    public MotivationalBook(String name) {
        this.name = name;
    }

    @Override
    public String formatText(String text) {
        return text.toUpperCase();
    }
}
