package com.orientacaoobjeto.briesservice.controllers;

import com.orientacaoobjeto.briesservice.models.Request;
import com.orientacaoobjeto.briesservice.models.RequestItems;
import com.orientacaoobjeto.briesservice.services.RequestItemsService;
import com.orientacaoobjeto.briesservice.services.RequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/request")
public class RequestController {

    @Autowired
    RequestService service;

    @Autowired
    RequestItemsService requestItemsService;

    @PostMapping("/save")
    public Request create(@RequestBody Request newRequest){
        service.save(newRequest);
        return newRequest;
    }

    @PostMapping("/addItem")
    public RequestItems addItem(@RequestBody RequestItems newRequestItem){
        requestItemsService.save(newRequestItem);
        return newRequestItem;
    }

    @GetMapping("/listItems/{id}")
    public Optional<Request> listItems(@PathVariable Long id) {
        return service.getDetails(id);
    }
}
