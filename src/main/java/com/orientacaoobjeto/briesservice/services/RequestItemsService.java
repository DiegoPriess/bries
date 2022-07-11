package com.orientacaoobjeto.briesservice.services;

import com.orientacaoobjeto.briesservice.models.Item;
import com.orientacaoobjeto.briesservice.models.RequestItems;
import com.orientacaoobjeto.briesservice.repository.RequestItemsRepository;
import com.sun.istack.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.naming.NoPermissionException;

@Service
public class RequestItemsService {

    @Autowired
    private RequestItemsRepository repository;

    @Autowired
    RequestService requestService;

    @Autowired
    ItemService itemService;

    public void save(@NotNull final RequestItems newRequestItem) {
        repository.save(newRequestItem);
    }

    public RequestItems buildInstance(@NotNull Long requestId, @NotNull Long itemId, @NotNull Integer amount) {
        RequestItems newRequestItem = new RequestItems();
        Item item = itemService.getDetails(itemId);
        newRequestItem.setRequest(requestService.getDetails(requestId));
        newRequestItem.setItem(item);
        newRequestItem.setAmount(amount);

        removeItemsFromStock(itemId, amount);

        return newRequestItem;
    }

    public void removeItemsFromStock(@NotNull Long itemId, @NotNull Integer amount) {
        Item item = itemService.getDetails(itemId);
        item.setAmountStock(item.getAmountStock() - amount);
        itemService.save(item);
    }
}