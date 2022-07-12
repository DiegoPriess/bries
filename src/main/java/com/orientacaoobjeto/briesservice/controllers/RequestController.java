package com.orientacaoobjeto.briesservice.controllers;

import com.orientacaoobjeto.briesservice.models.Item;
import com.orientacaoobjeto.briesservice.models.dto.ListItemRequestDTO;
import com.orientacaoobjeto.briesservice.models.Request;
import com.orientacaoobjeto.briesservice.models.RequestItems;
import com.orientacaoobjeto.briesservice.services.ItemService;
import com.orientacaoobjeto.briesservice.services.RequestItemsService;
import com.orientacaoobjeto.briesservice.services.RequestService;
import com.orientacaoobjeto.briesservice.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.naming.NoPermissionException;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/request")
public class RequestController {

    @Autowired
    RequestService service;

    @Autowired
    RequestItemsService requestItemsService;

    @Autowired
    UserService userService;

    @Autowired
    ItemService itemService;

    @GetMapping("/save/{userId}")
    public Request create(@PathVariable Long userId){
        Request newRequest = new Request();
        newRequest.setUser(userService.getDetails(userId));
        newRequest.setDate(new Date());
        service.save(newRequest);
        return newRequest;
    }

    @GetMapping("/addItem/{requestId}/{itemId}/{amount}")
    public RequestItems addItem(@PathVariable Long requestId, @PathVariable Long itemId, @PathVariable Integer amount) throws NoPermissionException {

        RequestItems newRequestItem = requestItemsService.buildInstance(requestId, itemId, amount);
        requestItemsService.save(newRequestItem);

        return newRequestItem;
    }

    @GetMapping("/listRequestItems/{id}")
    public List<ListItemRequestDTO> listRequestItems(@PathVariable Long id) {
        return requestItemsService.getItemsByRequest(id);
    }

    @GetMapping("/calcTotalRequest/{id}")
    public Double calcTotalRequest(@PathVariable Long id) {
        return requestItemsService.calcTotalRequest(id);
    }
}
