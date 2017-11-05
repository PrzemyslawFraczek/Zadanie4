package com.company;

import java.util.LinkedList;
import java.util.List;

public class Company {
    List <Employee> employees = new LinkedList<Employee>();


    void addCustomer(Customer employee){
        employees.add(employee);

    }
    void addEmployee (Employee employee){
        employees.add(employee);

    }
    int sumOfSalaries() {
        int sumOfSalaries = 0 ;
        for (Employee employee : employees) {
            sumOfSalaries += employee.calculateNetSalary();
        }

        return sumOfSalaries;
    }
    int averageOfSalaries() {
         int averageOfSalaries = sumOfSalaries()/ employees.size();
         return averageOfSalaries;
    }
}
