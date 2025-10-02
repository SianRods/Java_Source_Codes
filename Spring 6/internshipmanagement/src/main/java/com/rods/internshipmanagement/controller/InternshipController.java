package com.rods.internshipmanagement.controller;

import com.rods.internshipmanagement.model.Internship;
import com.rods.internshipmanagement.service.InternshipService;
import jakarta.annotation.security.PermitAll;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
//create a base RequestMapping
public class InternshipController {
    @Autowired
    InternshipService service;

    @PostMapping("internship")
    public Internship saveInternship(@RequestBody Internship internship) {
        service.saveInternship(internship);
        return internship;
    }

    // Note that while updating the internship we do have to mention it;s ID
    @PutMapping("internship")
    public Internship updateInternship(@RequestBody Internship internship) {
        service.updateInternship(internship);
        return internship;
    }


    @DeleteMapping("internship/{id}")
    public boolean deleteInternship(@PathVariable long id) {
        service.deleteInternship(id);
        return true;
    }

    @GetMapping("search/{title}")
    public List<Internship> getByTitle(@PathVariable String title) {
        return service.findByTitle(title);
    }

    @GetMapping("internship/{id}")
    public Optional<Internship> findByID(@PathVariable(name = "id") long internID) {
        return service.findByInternshipID(internID);
    }


    @GetMapping("internships")
    List<Internship> getAll() {
        return service.findAllInternships();
    }


    @GetMapping("internships/{company}")
    public List<Internship> getByCompany(@PathVariable String company) {
        return service.findByCompany(company);
    }

    @GetMapping("search/{location}")
    public List<Internship> getByLocation(@PathVariable String location) {
        return service.findByLocation(location);
    }


}
