package com.kodilla.hibernate.manytomany.controllers;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CompanyController {

    private final CompanyService companyService;

    @Autowired
    public CompanyController(CompanyService companyService) {
        this.companyService = companyService;
    }

    @GetMapping("/companies")
    public List<Company> getCompaniesByFragment(@RequestParam("fragment") String fragment) {
        return companyService.getCompaniesByFragment(fragment);
    }
}
