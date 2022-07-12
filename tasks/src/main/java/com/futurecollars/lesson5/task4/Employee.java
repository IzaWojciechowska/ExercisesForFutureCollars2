package com.futurecollars.lesson5.task4;

import java.math.BigDecimal;

public class Employee {

    private final String NAME;
    private final String SURNAME;
    private int age;
    private BigDecimal baseSalary;
    private BigDecimal bonus;

    public Employee(String NAME, String SURNAME) {
        this.NAME = NAME;
        this.SURNAME = SURNAME;
    }

    public Employee(String NAME, String SURNAME, int age) {
        this.NAME = NAME;
        this.age = age;
        this.SURNAME = SURNAME;
    }

    public Employee(String NAME, String SURNAME, int age, BigDecimal baseSalary) {
        this.NAME = NAME;
        this.age = age;
        this.baseSalary = baseSalary;
        this.SURNAME = SURNAME;
    }

    public Employee(String NAME, String SURNAME, int age, BigDecimal baseSalary, BigDecimal bonus) {
        this.NAME = NAME;
        this.age = age;
        this.baseSalary = baseSalary;
        this.bonus = bonus;
        this.SURNAME = SURNAME;
    }

    public BigDecimal getSalary() {
        return baseSalary;
    }

    public BigDecimal getBonus() {
        return bonus;
    }

    public BigDecimal getTotalSalary() {
        return baseSalary.add(bonus);
    }

    public String getEmployeeDescription() {
        return "Employee name : " + NAME + " " + SURNAME;
    }

    public String getEmployeeDetailsWithAge() {
        return "Employee details : " + NAME + " " + SURNAME + " is " + age;
    }

}

