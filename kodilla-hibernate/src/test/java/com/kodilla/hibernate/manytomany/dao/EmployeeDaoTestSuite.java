package com.kodilla.hibernate.manytomany.dao;


import com.kodilla.hibernate.manytomany.Employee;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


@SpringBootTest
class EmployeeDaoTestSuite {

    @Autowired
    private EmployeeDao employeeDao;

    @Autowired
    private CompanyDao companyDao;

    @Test
    void testFindEmployeesWithAGivenLastname() {
        // Given
        Employee employee1 = new Employee("John", "Smith");
        Employee employee2 = new Employee("Adam", "Smith");
        employeeDao.save(employee1);
        employeeDao.save(employee2);

        // When
        List<Employee> employees = employeeDao.findEmployeesWithAGivenLastname("Smith");

        // Then
        assertEquals(2, employees.size());
        assertEquals("Smith", employees.get(0).getLastname());
        assertEquals("Smith", employees.get(1).getLastname());
    }

    @Test
    void testFindEmployeesWithAGivenPartOfLastname() {
        // Given
        Employee employee1 = new Employee("John", "Smith");
        Employee employee2 = new Employee("Adam", "Johnson");
        employeeDao.save(employee1);
        employeeDao.save(employee2);

        // When
        List<Employee> employees = employeeDao.findEmployeesWithAGivenPartOfLastname("son");

        // Then
        assertEquals(1, employees.size());
        assertEquals("Johnson", employees.get(0).getLastname());
    }
}
