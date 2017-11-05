package com.company;

public class TemporaryEmployee extends Employee {


    public TemporaryEmployee(int grossSalary) {
        super(grossSalary);
    }

    @Override
    double calculateNetSalary() {
        return getGrossSalary() * 0.9;
    }


}
