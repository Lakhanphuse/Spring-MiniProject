package com.qspiders.employee.Service;

import com.qspiders.employee.Model.Employee;
import com.qspiders.employee.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository repository;

    public void addEmployee(Employee e) {
        repository.save(e);
    }

    public List<Employee> getAllEmployee() {
        List<Employee> employeeList = repository.findAll();
        return employeeList;
    }

    public Employee getEmployeeById(int id) {
        Employee e = repository.findById(id).orElse(null);
        return e;
    }

    public void updateEmployee(Employee e) {
        repository.save(e);
    }

    public void deleteEmployeeById(int id) {
        repository.deleteById(id);
    }

    public List<Employee> findByEmployeeName(String employeeName) {
        List<Employee> employees = repository.findByEmployeeName(employeeName);
        return employees;
    }

    public List<Employee> findByEmployeeDesg(String employeeDesg) {
        List<Employee> employees1 = repository.findByEmployeeDesg(employeeDesg);
        return employees1;
    }

    public List<Employee> findByEmployeeSalaryGreaterThan(double employeeSalary) {
        List<Employee> employees2 = repository.findByEmployeeSalaryGreaterThan(employeeSalary);
        return employees2;
    }

    public List<Employee> findByEmployeeAgeLessThan(int employeeAge) {
        List<Employee> employees3 = repository.findByEmployeeAgeLessThan(employeeAge);
        return employees3;
    }

    public List<Employee> findByEmployeeDesgAndEmployeeSalaryLessThan(String employeeDesg, double employeeSalary) {
        List<Employee> employees4 = repository.findByEmployeeDesgAndEmployeeSalaryLessThan(employeeDesg, employeeSalary);
        return employees4;
    }

    public List<Employee> findByEmployeeDesgIn(List<String> employeeDesg) {
        return repository.findByEmployeeDesgIn(employeeDesg);
    }

    public List<Employee> findByEmployeeSalaryBetween(double employeeSalary, double employeeSalary1) {
        List<Employee> employees = repository.findByEmployeeSalaryBetween(employeeSalary, employeeSalary1);
        return employees;
    }

    public List<Employee> findByEmployeeDesgContaining(String employeeDesg) {
        List<Employee> employees = repository.findByEmployeeDesgContaining(employeeDesg);
        return employees;
    }

    public List<Employee> findByEmployeeSalaryLessThanOrEmployeeAgeGreaterThan(double employeeSalary, int employeeAge) {
        List<Employee> employees = repository.findByEmployeeSalaryLessThanOrEmployeeAgeGreaterThan(employeeSalary, employeeAge);
        return employees;
    }

    public List<Employee> displayEmployee(String employeeDesg) {
        return repository.displayEmployee(employeeDesg);
    }

    public List<Employee> showEmployee(String employeeName) {
        return repository.showEmployee(employeeName);
    }

   /* public void updateAllEmployee(String prefix){
        repository.updateAllEmployees(prefix);
    }*/

}