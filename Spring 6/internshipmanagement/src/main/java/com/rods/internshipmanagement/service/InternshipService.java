package com.rods.internshipmanagement.service;

import com.rods.internshipmanagement.model.Internship;
import com.rods.internshipmanagement.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InternshipService {
    @Autowired
    private InternshipRepository repo;

    public boolean saveInternship(Internship internship) {
        repo.save(internship);
        return true;

    }

    public Internship updateInternship(Internship updatedInternship) {
        // We do need the InternshipID in order to update the parameters of an existing internship
        if (updatedInternship.getInternshipID() == null) {
            throw new RuntimeException("Internship ID is required for update");
        }

        //
        Optional<Internship> optionalInternship = repo.findById(updatedInternship.getInternshipID());

        if (optionalInternship.isPresent()) {
            Internship existingInternship = optionalInternship.get();

            // Update fields
            existingInternship.setTitle(updatedInternship.getTitle());
            existingInternship.setCompany(updatedInternship.getCompany());
            existingInternship.setLocation(updatedInternship.getLocation());
            existingInternship.setDeadline(updatedInternship.getDeadline());
            existingInternship.setUser(updatedInternship.getUser());

            return repo.save(existingInternship);
        } else {
            throw new RuntimeException("Internship not found with ID: " + updatedInternship.getInternshipID());
        }
    }


    public boolean deleteInternship(long internID) {
        for (Internship intern : repo.findAll()) {
            if (intern.getInternshipID() == internID) {
                repo.delete(intern);
            }
        }
        return true;
    }

    public List<Internship> findByTitle(String title) {
        return repo.findByTitleStartingWith(title);
    }

    public Optional<Internship> findByInternshipID(long internID) {
        return repo.findByInternshipID(internID);
    }

    public List<Internship> findByCompany(String company) {
        return repo.findByCompany(company);
    }

    public List<Internship> findByLocation(String location) {
        return repo.findByLocation(location);
    }


    public List<Internship> findAllInternships() {
        return repo.findAll();
    }
}
