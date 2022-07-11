package com.orientacaoobjeto.briesservice.services;

import com.orientacaoobjeto.briesservice.models.RequestItems;
import com.orientacaoobjeto.briesservice.repository.RequestItemsRepository;
import com.sun.istack.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RequestItemsService {

    @Autowired
    private RequestItemsRepository repository;

    public void save(@NotNull final RequestItems newRequestItem) {
        repository.save(newRequestItem);
    }
}
