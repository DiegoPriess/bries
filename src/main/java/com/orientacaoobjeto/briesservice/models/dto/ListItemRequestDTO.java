package com.orientacaoobjeto.briesservice.models.dto;

import com.orientacaoobjeto.briesservice.models.Item;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ListItemRequestDTO {

    private Item item;
    private Integer amount;
}
