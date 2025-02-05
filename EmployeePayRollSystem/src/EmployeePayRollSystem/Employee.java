package EmployeePayRollSystem;

import java.security.PrivateKey;

public abstract class Employee {
     String name;
     int id;
     String designation;
     String department;


    abstract public void getDetails();
    abstract public double CalculateSalary();
}

class FullTimeEmployee extends Employee{
    @Override
    public void getDetails() {
        System.out.println("Employee ID = " + id);
        System.out.println("Employee Name = " + name);
        System.out.println("Designation = " + designation);
        System.out.println("Departement = " + department);
    }

    @Override
    public double CalculateSalary() {

    }
}
