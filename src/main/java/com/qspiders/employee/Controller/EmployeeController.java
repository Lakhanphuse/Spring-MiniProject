package com.qspiders.employee.Controller;

import com.qspiders.employee.Model.Employee;
import com.qspiders.employee.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin("http://localhost:3000/")
@RestController
public class EmployeeController {

    @Autowired
    EmployeeService service;


    @PostMapping("/emp")
    public void addEmployee(@RequestBody Employee e) {

        service.addEmployee(e);
    }

    @GetMapping("/emp")
    public List<Employee> getAllEmployee() {
        return service.getAllEmployee();
    }

    @GetMapping("/emp/{id}")
    public Employee getEmployeeById(@PathVariable int id) {
        return service.getEmployeeById(id);
    }

    @PutMapping("/emp/")
    public void updateEmployee(@RequestBody Employee e) {
        service.updateEmployee(e);
    }

    @DeleteMapping("/emp/{id}")
    public void deleteEmployeeById(@PathVariable int id) {
        service.deleteEmployeeById(id);
    }

    @GetMapping("/empfindByEmployeeName/{employeeName}")
    public List<Employee> findByEmployeeName(@PathVariable String employeeName) {
        return service.findByEmployeeName(employeeName);

    }

    @GetMapping("/empfindByEmployeeDesg/{employeeDesg}")
    public List<Employee> findByEmployeeDesg(@PathVariable String employeeDesg) {
        return service.findByEmployeeDesg(employeeDesg);

    }

    @GetMapping("/empfindByEmployeeSalaryGreaterThan")
    public List<Employee> findByEmployeeSalaryGreaterThan(@RequestParam double employeeSalary) {
        return service.findByEmployeeSalaryGreaterThan(employeeSalary);

    }

    @GetMapping("/empfindByEmployeeAgeLessThan")
    public List<Employee> findByEmployeeAgeLessThan(@RequestParam int employeeAge) {
        return service.findByEmployeeAgeLessThan(employeeAge);

    }

    @GetMapping("/empfindByEmployeeDesgAndEmployeeSalaryLessThan")
    public List<Employee> findByEmployeeDesgAndEmployeeSalaryLessThan(@RequestParam String employeeDesg, @RequestParam double employeeSalary) {
        return service.findByEmployeeDesgAndEmployeeSalaryLessThan(employeeDesg, employeeSalary);

    }

    @GetMapping("/findByEmployeeDesgIn")
    public List<Employee> findByEmployeeDesgIn(String desg1, String desg2, String desg3){
        List<String> designation = new ArrayList<>();
        designation.add(desg1);
        designation.add(desg2);
        designation.add(desg3);
        return service.findByEmployeeDesgIn(designation);
    }

    @GetMapping("/findByEmployeeSalaryBetween")
    public List<Employee> findByEmployeeSalaryBetween(@RequestParam double employeeSalary,@RequestParam double employeeSalary1){
       return service.findByEmployeeSalaryBetween(employeeSalary,employeeSalary1);

    }

    @GetMapping("/findByEmployeeDesgContaining")
    public List<Employee> findByEmployeeDesgContaining(@RequestParam String employeeDesg ){
        return service.findByEmployeeDesgContaining(employeeDesg);

    }

    @GetMapping("/findByEmployeeSalaryLessThanOrEmployeeAgeGreaterThan")
    public List<Employee> findByEmployeeSalaryLessThanOrEmployeeAgeGreaterThan(@RequestParam double employeeSalary,@RequestParam int employeeAge){
        return service.findByEmployeeSalaryLessThanOrEmployeeAgeGreaterThan(employeeSalary,employeeAge);

    }

    @GetMapping("/customquery/{employeeDesg}")
    public List<Employee> displayEmployee(@PathVariable String employeeDesg) {
        return service.displayEmployee(employeeDesg);

    }

    @GetMapping("/showEmployee/{employeeName}")
    public List<Employee> showEmployee(@PathVariable String employeeName) {
        return service.showEmployee(employeeName);
    }

   /* @PutMapping("/updateAllEmployee/{prefix}")
    public void updateAllEmployee(String prefix){
        service.updateAllEmployee(prefix);
    }*/
}