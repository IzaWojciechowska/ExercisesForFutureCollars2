package com.futurecollars.lesson6.task0;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class CreateTxtFile {

    public static void main(String[] args) {

        File file = new File("C:\\Users\\Acer\\Desktop\\FutureCollars\\lesson6\\data.txt");

        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            Files.writeString(file.toPath(),
                    "Kurs\n" +
                    "Java\n" +
                    "Lekcja 6\n" +
                    "Pliki\n" +
                    "Wyjatki\n" +
                    "Pliki\n" +
                    "Koniec pliku\n");
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
