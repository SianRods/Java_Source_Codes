package com.rods.internshipmanagement.service;


import com.rods.internshipmanagement.repository.*;
import com.rods.internshipmanagement.model.*;
import com.rods.internshipmanagement.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class UserService {

    //creating a repo instant
    @Autowired
    private UserRepository repo;

    // Note that

    public Optional<User> getUserByID(long userID) {
        return repo.findByUserId(userID);
    }


    public List<User> getAllUsers() {
        return repo.findAll();
    }


    public boolean saveUser(User user) {
        repo.save(user);
        return true;
    }


    public boolean deleteUserByID(long userID) {
        for (User user : repo.findAll()) {
            if (user.getUserId() == userID) {
                repo.delete(user);
                break;
            }
        }


        return true;
    }


    // It will manage both the TPC's and User role
    public List<User> getAllSpecificUsers(User.Role role) {
        return repo.findAllByRole(role);
    }


    public User updateUser(User user) {
        User userUpdate = repo.findById(user.getUserId())
                .orElseThrow(() -> new RuntimeException("User not found"));
        userUpdate.setUserId(user.getUserId());
        userUpdate.setName(user.getName());
        userUpdate.setRole(user.getRole());
        userUpdate.setPassword(user.getPassword());

        if (!userUpdate.getEmail().equals(user.getEmail())) {
            if (repo.existsByEmail(user.getEmail())) {
                throw new RuntimeException("Email already in use");
            }
            userUpdate.setEmail(user.getEmail());
        }

        return repo.save(userUpdate);
    }

}
