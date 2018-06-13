package com.exo.ecommerce.infrastructure.http.presentation.additemtocart;

import com.exo.ecommerce.domain.cart.Cart;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
public class AddItemToCartPresenter {

    public ResponseEntity present(Cart cart, long itemId) {
        return ResponseEntity.ok(new ItemAddedToCartResponse(itemId, cart));
    }
}
