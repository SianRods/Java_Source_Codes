package com.rods.restful_apis.controller;



/*
in spring there are basically two ways of declaring that a given controller is rest controller
and will return the data in the json format
1] @RestController
2] @ResponseBody ==> Over each request mapping

Rules of naming paths/routes in rest ==> Noun (Differentiating factor is the type of HTTP request being sent over)

*/

import com.rods.restful_apis.model.Internship;
import com.rods.restful_apis.service.InternshipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.util.List;

@RestController
public class InternshipController {

    @Autowired
    private InternshipService service;

    @GetMapping("/internships")
    public List<Internship> getAllInternships() {
        return service.getAllInternships();
    }

    /*
    In case we only want to search a single internship by it's ID then we can use the concept of path variable
    which is similar to that we use in case of Flask to take input directly from the route
    */

    @GetMapping(path="/internship/{internID}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Internship getInternshipByID(@PathVariable("internID") int internID) {
        return service.getByID(internID);
    }

    @PostMapping("/internship")
    public Internship addInternship(@RequestBody Internship internship) {
        service.addInternship(internship);
        return service.getByID(internship.getId());
    }


    // Rest Architecture ==> we will take the new internship inputkf as the new information and then try to update if the
    // id already exists
    @PutMapping(path = "/internship")
    public Internship updateInternship(@RequestBody Internship internship) {
        service.updateInternship(internship);
        return service.getByID(internship.getId());

    }


    @DeleteMapping("/internship/{internID}")
    public String removeInternship(@PathVariable int internID) {
        service.removeInternship(internID);
        return "Success : Internship Removed";

    }

}
