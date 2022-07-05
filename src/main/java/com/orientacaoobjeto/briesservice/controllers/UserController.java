package com.orientacaoobjeto.briesservice.controllers;

import com.orientacaoobjeto.briesservice.models.User;
import com.orientacaoobjeto.briesservice.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService service;

    @PostMapping("/save")
    public User createUser(@RequestBody User user){
        service.saveUser(user);
        return user;
    }

    @GetMapping("/details/{id}")
    public Optional<User> getUserDetails(@PathVariable Long id) {
        return service.getDetails(id);
    }
}
