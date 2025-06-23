package com.daniel.javacore.introducao.test;

import com.daniel.javacore.introducao.domain.Employee;


public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.name = "Joao";
        employee.age = 29;
        employee.ageInit = 18;
        employee.salary = new double[]{700, 1000, 1450.90, 2340.65};
        employee.printEmployeeInfos();
        employee.salaryBase();
        employee.printAllSalaries();
        employee.printYearsInEnterprise();
    }
}
