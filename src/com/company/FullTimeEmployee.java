package com.company;

public class FullTimeEmployee extends Employee {


    public FullTimeEmployee(int grossSalary) {
        super(grossSalary);
    }

    @Override
    double calculateNetSalary() {

        return (getGrossSalary()- 1000)*0.8;
    }


}
