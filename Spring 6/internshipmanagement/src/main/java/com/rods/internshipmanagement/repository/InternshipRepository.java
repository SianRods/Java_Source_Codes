package com.rods.internshipmanagement.repository;

import com.rods.internshipmanagement.model.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface InternshipRepository extends JpaRepository<Internship, Long> {
    Optional<User> findByTitle(String title);

    Optional<Internship> findById(int internshipID);

    boolean addInternship(Internship internship);

    List<Internship> getAllInternships();
}
