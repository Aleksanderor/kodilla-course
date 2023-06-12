package com.kodilla.hibernate.manytomany.companyService;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyService {

    private CompanyDao companyDao;
    private EmployeeDao employeeDao;

    public CompanyService(CompanyDao companyDao, EmployeeDao employeeDao) {
        this.companyDao = companyDao;
        this.employeeDao = employeeDao;
    }

    public List<Company> getCompanies(String fragmentOfTheName) {
        return companyDao.findCompaniesByAnyFragmentOfTheName(fragmentOfTheName);
    }

    public List<Employee> getEmployees(String fragmentOfTheName) {
        return employeeDao.findEmployeesWithAGivenPartOfLastname(fragmentOfTheName);
    }
}