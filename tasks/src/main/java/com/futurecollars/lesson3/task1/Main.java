package com.futurecollars.lesson3.task1;

public class Main {
    public static void main(String[] args) {

        Seat seat1 = new Seat(2,5, true);
        System.out.println(seat1);
        seat1.setSeatFree(false);
        System.out.println(seat1);

        Seat seat2 = new Seat(1,1, false);
        System.out.println(seat2);
        seat2.setSeatFree(true);
        System.out.println(seat2);

    }
}
