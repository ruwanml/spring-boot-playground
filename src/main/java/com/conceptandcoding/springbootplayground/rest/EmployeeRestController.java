package com.conceptandcoding.springbootplayground.rest;

import com.conceptandcoding.springbootplayground.entity.Employee;
import com.conceptandcoding.springbootplayground.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {

    private EmployeeService employeeService;

    @Autowired
    public EmployeeRestController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    // expose "/employees" and return a list of employees

    @GetMapping("/employees")
    public List<Employee> findAll() {
        return employeeService.findAll();
    }

    // add mapping for GET /employees/{employeeId}

    @GetMapping("/employees/{employeeId}")
    public Employee findById(@PathVariable int employeeId) {

        Employee employee = employeeService.findById(employeeId);

        if (employee == null) {
            throw new RuntimeException("Employee id is not found - " + employeeId);
        }

        return employee;
    }

    // add mapping for POST /employees - add new employee

    @PostMapping("/employees")
    public Employee addEmployee(@RequestBody Employee employee) {

        // also just in case client pass an id in JSON ... set id to 0
        // this is to force a save of new item ... instead of update

        employee.setId(0);

        Employee dbEmployee = employeeService.save(employee);

        return dbEmployee;
    }

    // add mapping for PUT /employees - update existing employee

    @PutMapping("/employees")
    public Employee updateEmployee(@RequestBody Employee employee) {

        Employee updatedEmployee = employeeService.save(employee);

        return updatedEmployee;

    }

    // add mapping for DELETE /employees/{employeeId} - delete employee

    @DeleteMapping("/employees/{employeeId}")
    public String deleteEmployee(int employeeId) {

        Employee tmpEmployee = employeeService.findById(employeeId);

        // throw an exception if null

        if (tmpEmployee == null) {
            throw new RuntimeException("Employee id not found - " + employeeId);
        }

        employeeService.deleteById(employeeId);

        return "Deleted employee id - " + employeeId;
    }

}