package com.futurecollars.lesson3.task3;

public class Manager extends BaseEmployee {
    private final double BASE_SALARY_FOR_MANAGER = 5000.0;
    private double salary;
    private double bonus = 500.0;
    private String position = "manager";

    public Manager(String firstName, String lastName, int yearOfEmployment, double salary) {
        super(firstName, lastName, yearOfEmployment, salary);
        this.salary = salary;
    }

    public Manager(String firstName, String lastName, int yearOfEmployment) {
        super(firstName, lastName, yearOfEmployment);
        this.salary = BASE_SALARY_FOR_MANAGER;
    }

    public void setSalary(double newValue) {
        this.salary = newValue;
    }
    public void setBonus(double newValue) {
        this.bonus = newValue;
    }

    @Override
    public String toString() {
        if (salary < BASE_SALARY_FOR_MANAGER) {
            return "Employee{" +
                    "firstName= '" + firstName + '\'' +
                    ", lastName= '" + lastName + '\'' +
                    ", position= '" + position + '\'' +
                    ", baseSalaryForThisPosition= " + BASE_SALARY_FOR_MANAGER +
                    ", \n actualSalary= " + salary +
                    ", bonus= " + bonus +
                    ", wholePayInMonth= " + calculateMonthlySalary(salary, bonus) +
                    ", yearsInCompany= " + (2022 - yearOfEmployment) +
                    '}' + " \n INFO= SALARY IS TOO LOW!" + "\n";
        } else {
            return "Employee{" +
                    "firstName= '" + firstName + '\'' +
                    ", lastName= '" + lastName + '\'' +
                    ", position= '" + position + '\'' +
                    ", baseSalaryForThisPosition= " + BASE_SALARY_FOR_MANAGER +
                    ", \n actualSalary= " + salary +
                    ", bonus= " + bonus +
                    ", wholePayInMonth= " + BaseEmployee.calculateMonthlySalary(salary, bonus) +
                    ", yearsInCompany= " + (2022 - yearOfEmployment) +
                    '}' + "\n";
        }
    }

}
