package com.ctech.rbacsystem.controller;

import com.ctech.rbacsystem.entity.User;
import com.ctech.rbacsystem.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public User saveUser(@RequestBody User user) {
        return userService.createUser(user);
    }

    @GetMapping
    public List<User> showAllUsers() {
        return userService.getAllUsers();
    }


}
