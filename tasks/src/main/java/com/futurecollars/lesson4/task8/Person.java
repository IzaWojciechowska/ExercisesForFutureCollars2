package com.futurecollars.lesson4.task8;

import java.util.Objects;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private String sex;
    private String nationality;

    public Person(String firstName, String lastName, int age, String sex, String nationality) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.sex = sex;
        this.nationality = nationality;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && firstName.equals(person.firstName) && lastName.equals(person.lastName) && sex.equals(person.sex) && nationality.equals(person.nationality);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, age, sex, nationality);
    }
}
