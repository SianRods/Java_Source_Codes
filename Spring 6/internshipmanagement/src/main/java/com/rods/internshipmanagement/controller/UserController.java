package com.rods.internshipmanagement.controller;

import com.rods.internshipmanagement.model.User;
import com.rods.internshipmanagement.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;
import java.util.Optional;

@RestController
public class UserController {
    @Autowired
    private UserService service;

    @PostMapping("/user")
    public Optional<User> addUser(@RequestBody User user) {
        service.saveUser(user);
        return service.getUserByID(user.getUserId());
    }

    @GetMapping("/users")
    public List<User> getAllUser() {
        return service.getAllUsers();
    }


    @GetMapping("/user/{userID}")
    public Optional<User> getUser(@PathVariable long userID) {
        return service.getUserByID(userID);
    }

    // Both the Endpoints should not have same url and with same method
    @GetMapping("/Role/{role}")
    public List<User> getStudents(@PathVariable User.Role role) {
        return service.getAllSpecificUsers(role);
    }


    @DeleteMapping("/user/{userID}")
    public boolean deleteUserByID(@PathVariable long userID) {
        service.deleteUserByID(userID);
        return true;
    }

    @PutMapping("/user")
    public boolean updateUser(@RequestBody User user) {
        service.updateUser(user);
        return true;
    }

}

/*

Problems in the Following Conroller :

1] Autoincrement is not consistent with update and delete routes
2] Creating more routes in order to handle the data properly


 */
