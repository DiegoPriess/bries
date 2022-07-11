package com.orientacaoobjeto.briesservice.controllers;

import com.orientacaoobjeto.briesservice.models.User;
import com.orientacaoobjeto.briesservice.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.naming.NoPermissionException;
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
    public User getDetails(@PathVariable Long id) {
        return service.getDetails(id);
    }

    @GetMapping("/auth/{cpf}/{senha}")
    public boolean authenticate(@PathVariable Long cpf, @PathVariable String senha) throws NoPermissionException {
        return service.authenticate(cpf, senha);
    }
}
