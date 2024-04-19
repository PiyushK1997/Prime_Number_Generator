package com.prime_number_generator.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.prime_number_generator.model.User;
import com.prime_number_generator.repository.UserRepository;
import com.prime_number_generator.service.UserService;

@RestController
public class UserController {
	@Autowired
    private UserService userService;

    @PostMapping("/users")
    public User createUser(@RequestBody User user) {
        return userService.save(user);
    }
}
