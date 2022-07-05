package com.orientacaoobjeto.briesservice.controllers;

import com.orientacaoobjeto.briesservice.models.User;
import com.orientacaoobjeto.briesservice.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService service;

    @PostMapping("/")
    public User user(@RequestBody User user){
        service.saveUser(user);
        return user;
    }
}
