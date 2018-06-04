package com.exo.ecommerce.infrastructure;

import com.exo.ecommerce.domain.Item;

import java.util.ArrayList;
import java.util.List;

public class ItemsPresenter {
    public ArrayList<ItemResponse> present(List<Item> items) {
        ArrayList<ItemResponse> response = new ArrayList<ItemResponse>();
        for (Item item : items) {
            response.add(new ItemResponse(item));
        }
        return response;
    }
}