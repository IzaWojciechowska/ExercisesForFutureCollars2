package com.futurecollars.lesson3.task3;

public class Main {
    public static void main(String[] args) {

        TicketSeller employee1 = new TicketSeller("Ala", "Makota", 2020, 2000);
        System.out.println(employee1);

        employee1.setSalary(3500);
        System.out.println(employee1);

        Manager employee2 = new Manager("Jork", "Jakobs", 2012);
        System.out.println(employee2);

        employee2.setSalary(10500.0);
        System.out.println(employee2);

        Manager employee3 = new Manager("Jan", "Jowak", 1999, 30000.0);
        employee3.setBonus(1000.0);
        System.out.println(employee3);
    }
}
