package com.rods.internshipapp.repository;

import com.rods.internshipapp.InternshipAppApplication;
import com.rods.internshipapp.model.Internship;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;


@Repository
public class InternshipRepo {
    // Maintaining the list of avaliable internship
    private List<Internship> internships = new ArrayList<>(
            Arrays.asList(
                    new Internship(1, "Full-Stack Intern", "Infosys", 18000, "Node JS"),
                    new Internship(2, "MLE Intern", "Stealth AI", 180000, "RAG, Tranformers ,LLM's")
            )
    );


    public int addInternship(Internship internship) {
        internships.add(internship);
        return 1;
    }


    public List<Internship> getAllInternships() {
        System.out.println(internships);
        return internships;
    }


}
