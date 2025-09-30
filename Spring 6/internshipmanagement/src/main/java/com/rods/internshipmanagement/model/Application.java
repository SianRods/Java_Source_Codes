package com.rods.internshipmanagement.model;

import jakarta.persistence.*;

import java.awt.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "applications",
        uniqueConstraints = @UniqueConstraint(columnNames = {"student_id", "internship_id"})
)
public class Application {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long application_id;

    @ManyToOne
    @JoinColumn(name = "student_id", nullable = false)
    private User student;

    @ManyToOne
    @JoinColumn(name = "internship_id", nullable = false)
    private Internship internship;

    @Enumerated(EnumType.STRING)
    private Status status = Status.PENDING;

    public enum Status {PENDING, ACCEPTED, REJECTED}

    private LocalDateTime appliedAt = LocalDateTime.now();

}
