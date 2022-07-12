package com.orientacaoobjeto.briesservice.controllers;

import com.orientacaoobjeto.briesservice.models.Item;
import com.orientacaoobjeto.briesservice.models.Request;
import com.orientacaoobjeto.briesservice.models.User;
import com.orientacaoobjeto.briesservice.services.ItemService;
import com.orientacaoobjeto.briesservice.services.RequestService;
import com.orientacaoobjeto.briesservice.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.naming.NoPermissionException;
import java.util.Optional;

@RestController
@RequestMapping("/item")
public class ItemController {

    @Autowired
    ItemService service;

    @PostMapping("/save")
    public Item create(@RequestBody Item newItem) throws NoPermissionException {
        service.save(newItem);
        return newItem;
    }

    @GetMapping("/details/{id}")
    public Item getDetails(@PathVariable Long id) {
        return service.getDetails(id);
    }
}
