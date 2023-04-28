package com.kodilla.hibernate.manytomany.employeeservice;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class EmployeeService {

    private CompanyDao companyDao;
    private EmployeeDao employeeDao;

    public EmployeeService(CompanyDao companyDao, EmployeeDao employeeDao) {
        this.companyDao = companyDao;
        this.employeeDao = employeeDao;
    }

    public List<Company> getCompanies(String partOfTheCompanyName) {
        return companyDao.findCompaniesByAnyFragmentOfTheName(partOfTheCompanyName);
    }

    public List<Employee> getEmployees(String partOfTheLastname) {
        return employeeDao.findEmployeesWithAGivenPartOfLastname(partOfTheLastname);
    }
}
