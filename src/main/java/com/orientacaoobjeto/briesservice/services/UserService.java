package com.orientacaoobjeto.briesservice.services;

import com.orientacaoobjeto.briesservice.models.User;
import com.orientacaoobjeto.briesservice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public void saveUser(User newUser) {
        this.repository.save(newUser);
    }
}
