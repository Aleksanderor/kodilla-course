package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class taskFasade {

    private CompanyDao companyDao;
    private EmployeeDao employeeDao;

    public taskFasade(CompanyDao companyDao, EmployeeDao employeeDao) {
        this.companyDao = companyDao;
        this.employeeDao = employeeDao;
    }

    public List<Company> getCompaniesByFragmentOfName(String partOfTheCompanyName) {
        return companyDao.findCompaniesByAnyFragmentOfTheName(partOfTheCompanyName);
    }

    public List<Employee> getEmployeesByPartOfLastname(String partOfTheLastname) {
        return employeeDao.findEmployeesWithAGivenPartOfLastname(partOfTheLastname);
    }
}