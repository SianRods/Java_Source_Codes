package com.rods.internshipmanagement.repository;

import com.rods.internshipmanagement.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    //getUserByID
    //getAllTheStudents
    //getAlltheTPOs
    //addTPO
    //addStudent
    //deleteStudent ==> by ID
    //updateStudent
    //deleteTPO ==> By ID
    Optional<User> getUserById(Long id);

    List<User> getAllUser();



    

}
