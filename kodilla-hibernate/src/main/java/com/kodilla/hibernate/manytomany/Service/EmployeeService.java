package com.kodilla.hibernate.manytomany.Service;

import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class EmployeeService {

    private final EmployeeDao employeeDao;

    public EmployeeService(EmployeeDao employeeDao) {
        this.employeeDao = employeeDao;
    }

    public List<Employee> getEmployeesByLastName(String lastName) {
        return employeeDao.findEmployeesWithAGivenLastname(lastName);
    }

    public List<Employee> getEmployeesByPartialLastName(String partialLastName) {
        return employeeDao.findEmployeesWithAGivenPartOfLastname(partialLastName);
    }
}
