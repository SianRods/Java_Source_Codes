package com.rods.internshipmanagement.controller;

import com.rods.internshipmanagement.model.Application;
import com.rods.internshipmanagement.model.Internship;
import com.rods.internshipmanagement.model.User;
import com.rods.internshipmanagement.service.ApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
/// Base route for applications
@RequestMapping("/applications")
public class ApplicationController {

    @Autowired
    private ApplicationService applicationService;

    // Create a new application
    @PostMapping("/add")
    public Application addApplication(@RequestBody Application application) {
        return applicationService.addApplication(application);
    }

    // Update an existing application
    @PutMapping("/update")
    public Application updateApplication(@RequestBody Application application) {
        return applicationService.updateApplication(application);
    }

    // Get all applications
    @GetMapping("/all")
    public List<Application> getAllApplications() {
        return applicationService.getAllApplications();
    }

    // Get applications by internship
    @GetMapping("/byInternship/{internshipId}")
    public List<Application> getByInternship(@PathVariable Long internshipId) {
        Internship internship = new Internship();
        internship.setInternshipID(internshipId); // assuming setter exists
        return applicationService.findByInternship(internship);
    }

    // Get applications by student
    @GetMapping("/byStudent/{userId}")
    public List<Application> getByStudent(@PathVariable Long userId) {
        User user = new User();
        user.setUserId(userId); // assuming setter exists
        return applicationService.findByStudent(user);
    }

    // Get applications by status
    @GetMapping("/byStatus/{status}")
    public List<Application> getByStatus(@PathVariable Application.Status status) {
        return applicationService.findByStatus(status);
    }
}
