package com.orientacaoobjeto.briesservice.controllers;

import com.orientacaoobjeto.briesservice.models.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @PostMapping("/")
    public User user(@RequestBody User user){
        return user;
    }
}
