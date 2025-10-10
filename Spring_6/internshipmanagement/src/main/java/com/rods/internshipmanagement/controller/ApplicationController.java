package com.rods.internshipmanagement.controller;

import com.rods.internshipmanagement.model.Application;
import com.rods.internshipmanagement.model.Internship;
import com.rods.internshipmanagement.model.User;
import com.rods.internshipmanagement.service.ApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

@RequestMapping("/applications")
public class ApplicationController {

    @Autowired
    private ApplicationService applicationService;


    @PostMapping("/add")
    public Application addApplication(@RequestBody Application application) {
        return applicationService.addApplication(application);
    }


    @PutMapping("/update")
    public Application updateApplication(@RequestBody Application application) {
        return applicationService.updateApplication(application);
    }


    @GetMapping("/all")
    public List<Application> getAllApplications() {
        return applicationService.getAllApplications();
    }


    @GetMapping("/byInternship/{internshipId}")
    public List<Application> getByInternship(@PathVariable Long internshipId) {
        Internship internship = new Internship();
        internship.setInternshipID(internshipId);
        return applicationService.findByInternship(internship);
    }


    @GetMapping("/byStudent/{userId}")
    public List<Application> getByStudent(@PathVariable Long userId) {
        User user = new User();
        user.setUserId(userId);
        return applicationService.findByStudent(user);
    }


    @GetMapping("/byStatus/{status}")
    public List<Application> getByStatus(@PathVariable Application.Status status) {
        return applicationService.findByStatus(status);
    }
}
