package com.rods.restful_apis.service;

import com.rods.restful_apis.model.Internship;
import com.rods.restful_apis.repository.InternshipRepo;
import org.springframework.beans.factory.annotation.Autowired;
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


    public Internship getByID(int internID) {
        return repo.getByID(internID);
    }

    public void updateInternship(Internship internship) {
        repo.updateInternship(internship);
    }

    public void removeInternship(int internID) {
        repo.removeInternship(internID);
    }
}
