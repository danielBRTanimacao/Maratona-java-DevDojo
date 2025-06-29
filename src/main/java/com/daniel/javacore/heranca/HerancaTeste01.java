package com.daniel.javacore.heranca;

import com.daniel.javacore.heranca.domain.Employee;
import com.daniel.javacore.heranca.domain.Person;

public class HerancaTeste01 {
    public static void main(String[] args) {
        Person person = new Person("Daniel");
        person.setCpf("1234567890");
        person.setCep("123456789");
        person.print();

        Employee employee = new Employee("Cururu",1450.35);
        employee.setCpf("1234567890");
        employee.setCep("1234567890");
        employee.print();
        employee.paymentRelatory();
    }
}
