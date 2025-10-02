package com.rods.internshipmanagement.service;


import com.rods.internshipmanagement.model.Application;
import com.rods.internshipmanagement.model.User;
import com.rods.internshipmanagement.model.Internship;
import com.rods.internshipmanagement.repository.ApplicationRepository;
import jakarta.websocket.server.ServerEndpoint;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@Service
public class ApplicationService {
    @Autowired
    private ApplicationRepository repo;

    // just write the queries related to reading the data
    // as far as updating the data /table is concerned it will be automatically generated

    public Application addApplication(Application application) {
        return repo.save(application);
    }

    public Application updateApplication(Application application) {
        // We do need the InternshipID in order to update the parameters of an existing internship
        // Always use the wrapper class in order to use the comparator operators
        if (application.getApplication_id() == null) {
            throw new RuntimeException("Internship ID is required for update");
        }

        Optional<Application> optionalApplication = repo.findById(application.getApplication_id());

        if (optionalApplication.isPresent()) {
            Application existingApplication = optionalApplication.get();

            // Update fields
            existingApplication.setStatus(application.getStatus());
            existingApplication.setAppliedAt(application.getAppliedAt());


            return repo.save(existingApplication);
        } else {
            throw new RuntimeException("Application not found with ID: " + application.getApplication_id());
        }

    }


    public List<Application> getAllApplications() {
        return repo.findAll();
    }


    public List<Application> findByInternship(Internship internship) {
        return repo.findByInternship(internship);
    }


    public List<Application> findByStudent(User user) {
        return repo.findByStudent(user);
    }


    public List<Application> findByStatus(Application.Status status) {
        return repo.findByStatus(status);
    }


}
