package com.futurecollars.lesson4.task8;

public class Main {

    public static void main(String[] args) {

        Person person1 = new Person("Ala", "Makota", 24, "female", "polish");

        Person person2 = new Person("Peter", "Kiersch", 55, "male", "german");

        Person person3 = new Person("Ala", "Makota", 24, "female", "polish");

        System.out.println(person1.equals(person2));
        System.out.println(person1.equals(person3));

        System.out.println(person1.hashCode());
    }
}
