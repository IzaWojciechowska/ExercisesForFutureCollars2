package com.futurecollars.lesson4.task1;

public class Main {
    public static void main(String[] args) {

        Message message1 = new ConsoleMessage();
        System.out.println(message1.getMessage());

        Message message2 = new WindowMessage();
        System.out.println(message2.getMessage());
    }
}
