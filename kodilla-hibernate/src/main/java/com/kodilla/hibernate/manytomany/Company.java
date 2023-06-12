package com.kodilla.hibernate.manytomany;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;


@NamedNativeQueries({
        @NamedNativeQuery(
                name = "Company.findCompaniesByFragmentOfTheNameNative",
                query = "SELECT * FROM COMPANIES WHERE substring(COMPANY_NAME, 1, 3) = :FRAGMENT_OF_THE_NAME",
                resultClass = Company.class
        ),
        @NamedNativeQuery(
                name = "Company.findCompaniesByAnyFragmentOfTheNameNative",
                query = "SELECT * FROM COMPANIES WHERE COMPANY_NAME LIKE CONCAT('%', :ARG, '%')",
                resultClass = Company.class
        )
})

@Entity
@Table(name = "COMPANIES")
public class Company {

    @Id
    @GeneratedValue
    @Column(name = "COMPANY_ID")
    private int id;

    @Column(name = "COMPANY_NAME")
    private String name;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "EMPLOYEES_COMPANIES",
            joinColumns = {@JoinColumn(name = "COMPANY_ID")},
            inverseJoinColumns = {@JoinColumn(name = "EMPLOYEE_ID")}
    )
    private List<Employee> employees = new ArrayList<>();

    public Company() {}

    public Company(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
}