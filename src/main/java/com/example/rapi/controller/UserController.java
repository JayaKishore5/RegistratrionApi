package com.example.rapi.controller;

import com.example.rapi.model.User;
import com.example.rapi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @PostMapping
    public User registerUser(@RequestBody User user) {
        return userService.saveUser(user);
    }

}
