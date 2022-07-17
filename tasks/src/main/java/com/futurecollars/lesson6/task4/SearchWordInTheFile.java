package com.futurecollars.lesson6.task4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class SearchWordInTheFile {

    public static void main(String[] args) {

        String searchingText = "Java";

        try {
            String text = Files.readString(Paths.get("C:\\Users\\Acer\\Desktop\\FutureCollars\\lesson6\\data.txt"));

            System.out.println("Does your file contain word " + searchingText + "? " + text.contains(searchingText));
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
