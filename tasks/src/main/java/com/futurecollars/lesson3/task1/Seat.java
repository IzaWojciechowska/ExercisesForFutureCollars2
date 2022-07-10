package com.futurecollars.lesson3.task1;

public class Seat {
    protected final int NUMBER;
    protected final int ROW;
    protected boolean isSeatFree;

    public Seat(int number, int row, boolean seatFree) {
        this.NUMBER = number;
        this.ROW = row;
        this.isSeatFree = seatFree;
    }

    public int getNumber() {
        return NUMBER;
    }

    public int getRow() {
        return ROW;
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
                "number= " + NUMBER +
                ", row= " + ROW +
                ", Is seat free? - " + isSeatAvailable +
                '}';
    }
}


