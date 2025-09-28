package com.rods.internshipapp.service;

import com.rods.internshipapp.InternshipAppApplication;
import com.rods.internshipapp.model.Internship;
import com.rods.internshipapp.repository.InternshipRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InternshipService {
    // will able to add the internships and return the list of all available internship
    @Autowired
    InternshipRepo repo;

    public int addInternship(Internship internship) {
        repo.addInternship(internship);
        return 1;
    }

    public List<Internship> getAllInternships() {

        return repo.getAllInternships();
    }


}
