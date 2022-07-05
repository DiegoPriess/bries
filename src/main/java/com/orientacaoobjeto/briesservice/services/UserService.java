package com.orientacaoobjeto.briesservice.services;

import com.orientacaoobjeto.briesservice.models.User;
import com.orientacaoobjeto.briesservice.repository.UserRepository;
import com.sun.istack.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public void saveUser(User newUser) {
        this.repository.save(newUser);
    }

    public Optional<User> getDetails(@NotNull final Long id) {
        return this.repository.findById(id);
    }
}
