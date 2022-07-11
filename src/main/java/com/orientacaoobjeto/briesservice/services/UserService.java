package com.orientacaoobjeto.briesservice.services;

import com.orientacaoobjeto.briesservice.models.User;
import com.orientacaoobjeto.briesservice.repository.UserRepository;
import com.sun.istack.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.naming.NoPermissionException;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public User getDetails(@NotNull final Long id) {
        return repository.findById(id).get();
    }

    public void save(@NotNull final User newUser) {
        repository.save(newUser);
    }

    public boolean authenticate(@NotNull final Long cpf, @NotNull final String password) throws NoPermissionException {
        if(repository.findByCpfAndPassword(cpf, password) == null){
            throw new NoPermissionException("Usuário ou senha incorreta");
        }
        return true;
    }
}
