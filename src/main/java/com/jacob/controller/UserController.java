package com.jacob.controller;

import com.jacob.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class UserController {
    @GetMapping
    public String hello() {
        return "hello";
    }

    @PostMapping
    public User hello(@RequestBody User user) {
        return user;
    }
}
