package com.rods.internshipmanagement.repository;

import com.rods.internshipmanagement.model.Application;
import com.rods.internshipmanagement.model.Internship;
import com.rods.internshipmanagement.model.User;
import org.aspectj.apache.bcel.generic.INVOKEINTERFACE;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface ApplicationRepository extends JpaRepository<Application, Long> {

    List<Application> findByInternship(Internship internship);

    List<Application> findByStudent(User student);


    //Whether i have  to submit it n ENUM form or else in the form of a String or anyother specific datatype
    // which have been mentioned in the entity wala part
    List<Application> findByStatus(Application.Status status);


}

