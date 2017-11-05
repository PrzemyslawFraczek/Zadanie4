package com.company;

abstract class Employee implements Person {

    private double zarobkiNetto;
    private int grossSalary ;
    abstract double calculateNetSalary();
    public Employee (int grossSalary) {
        this.grossSalary = grossSalary;
    }

    @Override
    public String getEmail() {
        return null;
    }

    public int getGrossSalary() {
        return grossSalary;
    }

    public double getZarobkiNetto() {
        return zarobkiNetto;
    }




}
