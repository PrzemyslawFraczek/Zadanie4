package com.company;

public class Student extends Employee {
    public Student(int grossSalary) {
        super(grossSalary);
    }

    @Override
    double calculateNetSalary() {

        return getGrossSalary()*0.95;
    }



}
