package com.qspiders.employee.Model;

import javax.persistence.*;

@Entity
@Table(name = "employee_info")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "employee_id")
    private int employeeId;
    @Column(name ="employee_name" )
    private String employeeName;
    @Column(name ="employee_age" )
    private int employeeAge;
    @Column(name = "employee_salary")
    private double employeeSalary;
    @Column(name = "employee_desg")
    private String employeeDesg;

    public Employee() {
    }

    public Employee(int employeeId, String employeeName, int employeeAge, double employeeSalary, String employeeDesg) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeAge = employeeAge;
        this.employeeSalary = employeeSalary;
        this.employeeDesg = employeeDesg;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public int getEmployeeAge() {
        return employeeAge;
    }

    public void setEmployeeAge(int employeeAge) {
        this.employeeAge = employeeAge;
    }

    public double getEmployeeSalary() {
        return employeeSalary;
    }

    public void setEmployeeSalary(double employeeSalary) {
        this.employeeSalary = employeeSalary;
    }

    public String getEmployeeDesg() {
        return employeeDesg;
    }

    public void setEmployeeDesg(String employeeDesg) {
        this.employeeDesg = employeeDesg;
    }
}
