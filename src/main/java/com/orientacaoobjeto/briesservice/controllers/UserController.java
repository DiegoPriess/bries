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
    public User create(@RequestBody User user){
        service.save(user);
        return user;
    }

    @GetMapping("/details/{id}")
    public Optional<User> getDetails(@PathVariable Long id) {
        return service.getDetails(id);
    }

    @GetMapping("/auth/{cpf}/{senha}")
    public boolean authenticate(@PathVariable Long cpf, @PathVariable String senha) {
        return service.authenticate(cpf, senha);
    }
}
