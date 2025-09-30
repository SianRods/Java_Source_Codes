package com.rods.internshipmanagement.model;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "users")
@Data // Using lombok for getters and setters
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    private String name;

    @Column(unique = true, nullable = false)
    private String email;

    // hashed password
    private String password;


    @Enumerated(EnumType.STRING)
    private Role role;

    private enum Role {
        Student, TPC
    }


}
