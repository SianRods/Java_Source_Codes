package com.rods.internshipmanagement.repository;

import com.rods.internshipmanagement.model.Application;
import org.aspectj.apache.bcel.generic.INVOKEINTERFACE;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ApplicationRepository extends JpaRepository<Application, Long> {


}

