package com.futurecollars.lesson3.task1;

public class Seat {
    protected int number;
    protected int row;
    protected boolean isSeatFree;

    public Seat(int number, int row, boolean seatFree) {
        this.number = number;
        this.row = row;
        this.isSeatFree = seatFree;
    }

    public int getNumber() {
        return number;
    }

    public int getRow() {
        return row;
    }

    public boolean isSeatFree() {
        return isSeatFree;
    }

    public void setSeatFree(boolean newValue) {
        isSeatFree = newValue;
    }

    @Override
    public String toString() {

        String isSeatAvailable;
        if (isSeatFree) {
            isSeatAvailable = "YES";
        } else {
            isSeatAvailable = "NO";
        }

        return "Seat {" +
                "number= " + number +
                ", row= " + row +
                ", Is seat free? - " + isSeatAvailable +
                '}';
    }
}


