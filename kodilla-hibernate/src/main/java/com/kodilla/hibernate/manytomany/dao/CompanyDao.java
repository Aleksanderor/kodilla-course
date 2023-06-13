package com.kodilla.hibernate.manytomany.dao;

import com.kodilla.hibernate.manytomany.Company;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public interface CompanyDao extends CrudRepository<Company, Integer> {

    @Query(nativeQuery = true, value = "SELECT * FROM COMPANIES WHERE substring(COMPANY_NAME, 1, 3) = :FRAGMENT_OF_THE_NAME")
    List<Company> findCompaniesByFragmentOfTheNameNative(@Param("FRAGMENT_OF_THE_NAME") String fragmentOfTheName);

    @Query(nativeQuery = true, value = "SELECT * FROM COMPANIES WHERE COMPANY_NAME LIKE CONCAT('%', :ARG, '%')")
    List<Company> findCompaniesByAnyFragmentOfTheName(@Param("ARG") String arg);
}