package com.qspiders.employee.Repository;

import com.qspiders.employee.Model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer> {

    //Get employees By names
    List<Employee> findByEmployeeName(String employeeName);
    //Please used Similar words when you are using urs own methods otherwise its will thorw exception

    // get Employee by Designation

    List<Employee> findByEmployeeDesg(String employeeDesg);

    //get Employee earning salary greter than specified amount
    List<Employee> findByEmployeeSalaryGreaterThan(double employeeSalary);

    //get emp having age less than specified age
    List<Employee> findByEmployeeAgeLessThan(int employeeAge);

    //get emp having specified designation and salary less than specified amount
    List<Employee> findByEmployeeDesgAndEmployeeSalaryLessThan(String employeeDesg,double employeeSalary);

    //Display all employee matching the specified designation
    List<Employee> findByEmployeeDesgIn(List<String> employeeDesg);

    //Find employee having salary between specified range
    List<Employee> findByEmployeeSalaryBetween(double employeeSalary,double employeeSalary1);

    //Find employee whose designation contain specified String
    List<Employee> findByEmployeeDesgContaining(String employeeDesg);

    //Display employee having salary less than Specified amount and age greater than specified value
    List<Employee> findByEmployeeSalaryLessThanOrEmployeeAgeGreaterThan(double employeeSalary,int employeeAge);


    /* Writing JPOL to perform databased opertaion*/

    /* Fetch All the employee based on there Designation*/
    @Query("select e from Employee e where e.employeeDesg=:employeeDesg")
    List<Employee> displayEmployee(@Param("employeeDesg")String employeeDesg );

    /* Fetch all the employee whose name contains specific charcter*/
    @Query("select e from Employee e where e.employeeName like %:employeeName%")
    List<Employee> showEmployee(@Param("employeeName")String employeeName);

    /* Update all employee names with specified prefix */
   /* @Query("update Employee e set e.employeeName=: prefix || e.employeeName")
    @Modifying
    @Transactional
    void updateAllEmployees(@Param("prefix") String prefix);*/

}
