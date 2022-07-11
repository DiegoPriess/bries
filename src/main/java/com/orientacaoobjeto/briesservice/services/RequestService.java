package com.orientacaoobjeto.briesservice.services;

import com.orientacaoobjeto.briesservice.models.Request;
import com.orientacaoobjeto.briesservice.models.User;
import com.orientacaoobjeto.briesservice.repository.RequestRepository;
import com.orientacaoobjeto.briesservice.repository.UserRepository;
import com.sun.istack.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class RequestService {

    @Autowired
    private RequestRepository repository;

    public void save(@NotNull final Request newRequest) {
        repository.save(newRequest);
    }

    public Optional<Request> getDetails(@NotNull final Long id) {
        return repository.findById(id);
    }
}
