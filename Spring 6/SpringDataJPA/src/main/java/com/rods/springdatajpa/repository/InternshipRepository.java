package com.rods.springdatajpa.repository;

import com.rods.springdatajpa.model.Internship;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.List;

@Repository
public interface InternshipRepository extends JpaRepository<Internship, Long> {

    /*

    There are two methods to access the query , by using the default standard naming
    conventions in order to access the start entity attributes from the database
    else we have to use the query method in order to explicitly generate the  query
    using JPQL (Java Persistent Query Language)

     */

    Optional<Internship> findById(Long id);

    List<Internship> findAllByCompany(String company);

    List<Internship> findByPosition(String position);


}
