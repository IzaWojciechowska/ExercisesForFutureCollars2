package com.futurecollars.lesson6.task3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class AmountOfCharacters {

    public static void main(String[] args) {

        try {
            String text = Files.readString(Paths.get("C:\\Users\\Acer\\Desktop\\FutureCollars\\lesson6\\data.txt"));
            System.out.println("Amount of characters in tis file is: " + text.length());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
