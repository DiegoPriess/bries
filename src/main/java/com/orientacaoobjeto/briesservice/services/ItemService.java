package com.orientacaoobjeto.briesservice.services;

import com.orientacaoobjeto.briesservice.models.Item;
import com.orientacaoobjeto.briesservice.models.Request;
import com.orientacaoobjeto.briesservice.repository.ItemRepository;
import com.orientacaoobjeto.briesservice.repository.RequestRepository;
import com.sun.istack.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.naming.NoPermissionException;
import java.util.Optional;

@Service
public class ItemService {

    @Autowired
    private ItemRepository repository;

    @Autowired
    UserService userService;

    public void save(@NotNull final Item newItem) {
        repository.save(newItem);
    }

    public Item getDetails(@NotNull final Long id) {
        return repository.findById(id).get();
    }
}
