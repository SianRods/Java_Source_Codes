package com.rods.internshipmanagement.service;

import com.rods.internshipmanagement.model.Internship;
import com.rods.internshipmanagement.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InternshipService {
    @Autowired
    private InternshipRepository repo;

    public boolean saveInternship(Internship internship) {
        try {
            repo.addInternship(internship);
        } catch (Exception e) {
            System.out.println(e);
        }
        return true;
    }

    public boolean updateInternship(Internship internship) {
        List<Internship> li = repo.getAllInternships();
        for (Internship intern : li) {
            if (intern.getInternshipID() == internship.getInternshipID()) {
                intern.setLocation(internship.getLocation());
                intern.setTitle(internship.getTitle());
                intern.setUser(internship.getUser());
                intern.setDeadline(internship.getDeadline());
                intern.setCompany(internship.getCompany());
                // keeping the ID constant
                return true;
            }
        }
        return false;
    }

    //==> no need to mention anything additional we already have an inbuilt method to do the same thing
    public boolean deleteInternship() {
        return true;
    }


}
