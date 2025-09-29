package com.rods.restful_apis.repository;

import com.rods.restful_apis.model.Internship;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@Repository
public class InternshipRepo {
    // Maintaining the list of avaliable internship
    private List<Internship> internships = new ArrayList<>(Arrays.asList(new Internship(1, "Full-Stack Intern", "Infosys", 18000, "Node JS"), new Internship(2, "MLE Intern", "Stealth AI", 180000, "RAG, Tranformers ,LLM's"), new Internship(3, "Testing Engineer", "Barclays", 18000, "Java , Junit")

    ));


    public int addInternship(Internship internship) {
        internships.add(internship);
        return 1;
    }


    public List<Internship> getAllInternships() {
        System.out.println(internships);
        return internships;
    }


    public Internship getByID(int internID) {
        for (Internship intern : internships) {
            if (intern.getId() == internID) {
                return intern;
            }
        }
        return null;

    }

    public void updateInternship(Internship internship) {
        for (Internship intern : internships) {
            if (intern.getId() == internship.getId()) {
                intern.setPosition(internship.getPosition());
                intern.setStipend(internship.getStipend());
                intern.setDesc(internship.getDesc());
                intern.setCompany(internship.getCompany());

            }
        }
    }

    // Method can also have a boolean return value to indicate the status update

    public void removeInternship(int internID) {
        for (Internship intern : internships) {
            if (intern.getId() == internID) {
                internships.remove(intern);
                return;
            }


        }

    }

}

