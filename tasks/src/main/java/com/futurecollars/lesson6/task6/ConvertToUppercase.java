package com.futurecollars.lesson6.task6;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ConvertToUppercase {

    public static void main(String[] args) {

        String text = null;

        try {
            text = Files.readString(Paths.get("C:\\Users\\Acer\\Desktop\\FutureCollars\\lesson6\\data.txt"));
            text.toUpperCase();
        } catch (IOException e) {
            e.printStackTrace();
        }

        File file = new File("C:\\Users\\Acer\\Desktop\\FutureCollars\\lesson6\\output.txt");

        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            Files.writeString(file.toPath(), text.toUpperCase());
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
