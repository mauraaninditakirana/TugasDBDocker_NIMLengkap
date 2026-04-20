package com.praktikumdb.deployy.controller;

import com.praktikumdb.deployy.model.User;
import com.praktikumdb.deployy.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }
    @PostMapping
    public String createUser(@RequestBody User request) {
        userService.addUser(request);
        return "User created successfull";
    }
    @GetMapping
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }
}
