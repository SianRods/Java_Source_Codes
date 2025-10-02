package com.rods.internshipmanagement.model;


import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Table(name = "internships")
@Data

public class Internship {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long internshipID;
    private String title;
    private String location;
    private String company;
    private LocalDate deadline;

    @ManyToOne
    @JoinColumn(name = "created_by")
    private User user;


}
