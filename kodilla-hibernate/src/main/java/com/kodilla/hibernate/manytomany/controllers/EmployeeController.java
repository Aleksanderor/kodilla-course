package com.kodilla.hibernate.manytomany.controllers;

import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {

    private final EmployeeService employeeService;

    @Autowired
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/employees")
    public List<Employee> getEmployeesByLastName(@RequestParam("lastName") String lastName) {
        return employeeService.getEmployeesByLastName(lastName);
    }

    @GetMapping("/employees/partial")
    public List<Employee> getEmployeesByPartialLastName(@RequestParam("partialLastName") String partialLastName) {
        return employeeService.getEmployeesByPartialLastName(partialLastName);
    }
}