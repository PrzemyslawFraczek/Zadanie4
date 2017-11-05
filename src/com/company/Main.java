package com.company;

public class Main {

    public static void main(String[] args) {
        Company company = new Company();
        company.addEmployee(new TemporaryEmployee(2500));
        company.addEmployee(new Student(2300));
        company.addEmployee(new FullTimeEmployee(2700));
        company.addCustomer(new Customer());



        System.out.println(company.averageOfSalaries());
        System.out.println(company.sumOfSalaries());
    }
}
