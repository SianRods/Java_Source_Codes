package com.rods.internshipapp.controller;

import com.rods.internshipapp.model.Internship;
import com.rods.internshipapp.service.InternshipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class HomeController {
    @Autowired
    private InternshipService service;

    @GetMapping({"/", "home"})
    public String getHome() {
        System.out.println("getHome() called");
        return "home";
    }


    @GetMapping("/add-internship")
    public String addInternship() {
        System.out.println("This method is called !");
        return "internshipform";
    }

    @PostMapping("/save-internship")
    public String saveInternship(@ModelAttribute Internship internship,Model model) {
        service.addInternship(internship);
        model.addAttribute("internship",internship);
        return "submitsuccess";
    }

    @GetMapping("/view-internships")
    public String viewAllInternships(Model model) {
        System.out.println("Inside View-internships page");
        List<Internship> internslist=service.getAllInternships();
        model.addAttribute("internships",internslist);
        return "viewinternship";
    }

}
