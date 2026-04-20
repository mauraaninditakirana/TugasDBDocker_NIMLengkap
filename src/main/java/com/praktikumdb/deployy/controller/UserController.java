package com.praktikumdb.deployy.controller;

import com.praktikumdb.deployy.model.User;
import com.praktikumdb.deployy.service.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
