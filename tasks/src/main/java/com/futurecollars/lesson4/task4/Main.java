package com.futurecollars.lesson4.task4;

public class Main {

    public static void main(String[] args) {

        MotivationalBook book1 = new MotivationalBook("Eat That Frog!");
        System.out.println( book1.name +
                book1.formatText("\nElbert Hubbard defined self-discipline as the ability to make yourself" +
                " \ndo what you should do, when you should do it, whether you feel like it or not.\n"));

        PsychologyBook book2 = new PsychologyBook("Dangerous Personalities");
        System.out.println( book2.name +
                book2.formatText("\nThinking that they'll change or that this time will be different" +
                " \nis like expecting a snake to be less of a reptile just because you fed them and stroked in." +
                " \nDon't expect goodness from those who can't deliver it..."));

    }
}
