package com.kodilla.hibernate.manytomany.dao;

import com.kodilla.hibernate.manytomany.Company;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Transactional
@Repository
public interface CompanyDao extends CrudRepository<Company, Integer> {

    @Query
    List<Company> findCompaniesByFragmentOfTheName(@Param("FRAGMENT_OF_THE_NAME") String fragmentOfTheName);

    @Query
    List<Company> findCompaniesByAnyFragmentOfTheName(@Param("ARG") String arg);
}