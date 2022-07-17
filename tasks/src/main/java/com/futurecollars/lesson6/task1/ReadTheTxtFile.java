package com.futurecollars.lesson6.task1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ReadTheTxtFile {

    public static void main(String[] args) {

        try {
            String text = Files.readString(Paths.get("C:\\Users\\Acer\\Desktop\\FutureCollars\\lesson6\\data.txt"));
            System.out.println(text);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}