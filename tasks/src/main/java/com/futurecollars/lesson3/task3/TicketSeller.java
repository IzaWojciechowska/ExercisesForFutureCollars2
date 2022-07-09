package com.futurecollars.lesson3.task3;

public class TicketSeller extends BaseEmployee {
    final double BASE_SALARY_FOR_TICKET_SELLER = 3000.0;
    double salary;
    String position = "ticket seller";

    public TicketSeller(String firstName, String lastName, int yearOfEmployment, double salary) {
        super(firstName, lastName, yearOfEmployment, salary);
            this.salary = salary;
    }

    public TicketSeller(String firstName, String lastName, int yearOfEmployment) {
        super(firstName, lastName, yearOfEmployment);
        this.salary = BASE_SALARY_FOR_TICKET_SELLER;
    }
    public void setSalary(double newValue) {
        this.salary = newValue;
    }

    @Override
    public String toString() {
        if (salary < BASE_SALARY_FOR_TICKET_SELLER) {
            return "Employee{" +
                    "firstName= '" + firstName + '\'' +
                    ", lastName= '" + lastName + '\'' +
                    ", position= '" + position + '\'' +
                    ", baseSalaryForThisPosition= " + BASE_SALARY_FOR_TICKET_SELLER +
                    ",\n actualSalary= " + salary +
                    ", yearsInCompany= " + (2022 - yearOfEmployment) +
                    '}' + ", \n INFO= SALARY IS TOO LOW!" + "\n";
        } else {
            return "Employee{" +
                    "firstName= '" + firstName + '\'' +
                    ", lastName= '" + lastName + '\'' +
                    ", position= '" + position + '\'' +
                    ", baseSalaryForThisPosition= " + BASE_SALARY_FOR_TICKET_SELLER +
                    ",\n actualSalary= " + salary +
                    ", yearsInCompany= " + (2022 - yearOfEmployment) +
                    '}' + "\n";
        }
    }
}
