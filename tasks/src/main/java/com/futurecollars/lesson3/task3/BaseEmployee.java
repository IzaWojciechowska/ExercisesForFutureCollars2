package com.futurecollars.lesson3.task3;

public class BaseEmployee {
    String firstName;
    String lastName;
    double salary;
    int yearOfEmployment;
    String position;

    public BaseEmployee(String firstName, String lastName, int yearOfEmployment, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.yearOfEmployment = yearOfEmployment;
    }
    public BaseEmployee(String firstName, String lastName, int yearOfEmployment) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.yearOfEmployment = yearOfEmployment;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getYearOfEmployment() {
        return yearOfEmployment;
    }

    public String getPosition() {
        return position;
    }

    public static double calculateMonthlySalary(double salary, double bonus) {
        return salary + bonus;
    }
}
