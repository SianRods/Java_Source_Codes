package com.rods.internshipmanagement.repository;

import com.rods.internshipmanagement.model.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface InternshipRepository extends JpaRepository<Internship, Long> {
    List<Internship> findByTitleStartingWith(String title);

    Optional<Internship> findByInternshipID(long internshipID);
    // Note that some of the common crud operations are already defined in the JpaRepository

    List<Internship> findByCompany(String company);

    List<Internship> findByLocation(String location);


}
