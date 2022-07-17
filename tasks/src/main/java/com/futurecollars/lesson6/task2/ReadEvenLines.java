package com.futurecollars.lesson6.task2;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.*;

public class ReadEvenLines {

    public static void main(String args[]) {

        long numberOfLines = 0;

        try (Stream<String> stream = Files.lines(Paths.get("C:\\Users\\Acer\\Desktop\\FutureCollars\\lesson6\\data.txt"), StandardCharsets.UTF_8)) {
            numberOfLines = stream.count();
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (int i = 0; i < numberOfLines; i++) {
            if (i % 2 == 0) {
                int lineNum = i;
                String line;
                try (Stream<String> lines = Files.lines(Paths.get("C:\\Users\\Acer\\Desktop\\FutureCollars\\lesson6\\data.txt"))) {
                    line = lines.skip(lineNum).findFirst().get();
                    System.out.println(line);
                } catch (IOException e) {
                    System.out.println(e);
                }
            }
        }


    }
}