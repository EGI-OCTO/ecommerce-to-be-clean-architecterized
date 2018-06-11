package com.exo.ecommerce.infrastructure.bdd;

import com.exo.ecommerce.domain.cart.Cart;
import com.exo.ecommerce.domain.cart.CartRepository;

import java.util.Optional;

public class MySQLCartRepository implements CartRepository {

    private CartCRUDRepository crudRepository;

    public MySQLCartRepository(CartCRUDRepository crudRepository) {
        this.crudRepository = crudRepository;
    }

    @Override
    public Optional<Cart> fetchCurrentCart() {
        return this.crudRepository.findTopByCheckedOutOrderByIdDesc(false);
    }

    @Override
    public Cart save(Cart cart) {
        return this.crudRepository.save(cart);
    }
}
