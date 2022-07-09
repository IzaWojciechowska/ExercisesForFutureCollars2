package com.futurecollars.lesson3.task2;

public class Film {
    private String title;
    private String nameOfDirector;
    private int duration;
    private int yearOfProduction;

    public Film(String title, String nameOfDirector, int duration, int yearOfProduction) {
        this.title = title;
        this.nameOfDirector = nameOfDirector;
        this.duration = duration;
        this.yearOfProduction = yearOfProduction;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getNameOfDirector() {
        return nameOfDirector;
    }

    public void setNameOfDirector(String nameOfDirector) {
        this.nameOfDirector = nameOfDirector;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    @Override
    public String toString() {
        return "Film{" +
                "title='" + title + '\'' +
                ", nameOfDirector='" + nameOfDirector + '\'' +
                ", duration=" + duration +
                ", yearOfProduction=" + yearOfProduction +
                '}';
    }
}
